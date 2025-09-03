// Player state variables
let currentSongIndex = 0;
let isPlaying = false;
let isShuffled = false;
let isRepeating = false;
let currentTab = 'all';
let recentlyPlayed = [];
let filteredSongs = [...songsData];

// Audio element
const audio = new Audio();
audio.volume = 0.5;

// DOM elements
const playPauseBtn = document.getElementById('playPauseBtn');
const prevBtn = document.getElementById('prevBtn');
const nextBtn = document.getElementById('nextBtn');
const albumArt = document.getElementById('albumArt');
const songTitle = document.getElementById('songTitle');
const songArtist = document.getElementById('songArtist');
const progressBar = document.getElementById('progressBar');
const progress = document.getElementById('progress');
const currentTime = document.getElementById('currentTime');
const totalTime = document.getElementById('totalTime');
const volumeSlider = document.getElementById('volumeSlider');
const volumeDisplay = document.getElementById('volumeDisplay');
const playlist = document.getElementById('playlist');
const searchInput = document.getElementById('searchInput');
const voiceBtn = document.getElementById('voiceBtn');
const shuffleBtn = document.getElementById('shuffleBtn');
const repeatBtn = document.getElementById('repeatBtn');
const tabs = document.querySelectorAll('.tab');

// Initialize visitor counter
function updateVisitorCounter() {
    let visitors = parseInt(localStorage.getItem('visitorCount') || '0');
    visitors++;
    localStorage.setItem('visitorCount', visitors.toString());
    document.getElementById('visitorCount').textContent = visitors;
}

// Load song
function loadSong(index) {
    const song = filteredSongs[index];
    if (!song) return;

    currentSongIndex = index;
    audio.src = song.file;
    albumArt.src = song.image;
    songTitle.textContent = song.title;
    songArtist.textContent = song.artist;

    // Add to recently played
    addToRecentlyPlayed(song);
    updatePlaylist();
}

// Play/Pause functionality
function togglePlayPause() {
    if (isPlaying) {
        audio.pause();
        playPauseBtn.textContent = '▶️';
        albumArt.classList.remove('playing');
        isPlaying = false;
    } else {
        audio.play().catch(e => {
            console.log('Audio play failed:', e);
            alert('Could not play audio. Please check your internet connection or try a different song.');
        });
        playPauseBtn.textContent = '⏸️';
        albumArt.classList.add('playing');
        isPlaying = true;
    }
}

// Next song
function nextSong() {
    if (isShuffled) {
        currentSongIndex = Math.floor(Math.random() * filteredSongs.length);
    } else {
        currentSongIndex = (currentSongIndex + 1) % filteredSongs.length;
    }
    loadSong(currentSongIndex);
    if (isPlaying) {
        audio.play().catch(e => console.log('Audio play failed:', e));
    }
}

// Previous song
function prevSong() {
    if (isShuffled) {
        currentSongIndex = Math.floor(Math.random() * filteredSongs.length);
    } else {
        currentSongIndex = (currentSongIndex - 1 + filteredSongs.length) % filteredSongs.length;
    }
    loadSong(currentSongIndex);
    if (isPlaying) {
        audio.play().catch(e => console.log('Audio play failed:', e));
    }
}

// Update progress bar
function updateProgress() {
    if (audio.duration) {
        const progressPercent = (audio.currentTime / audio.duration) * 100;
        progress.style.width = progressPercent + '%';
        currentTime.textContent = formatTime(audio.currentTime);
        totalTime.textContent = formatTime(audio.duration);
    }
}

// Format time in MM:SS format
function formatTime(seconds) {
    const mins = Math.floor(seconds / 60);
    const secs = Math.floor(seconds % 60);
    return `${mins}:${secs.toString().padStart(2, '0')}`;
}

// Set progress when clicking on progress bar
function setProgress(e) {
    const rect = progressBar.getBoundingClientRect();
    const clickX = e.clientX - rect.left;
    const width = rect.width;
    const percentage = clickX / width;
    
    if (audio.duration) {
        audio.currentTime = percentage * audio.duration;
    }
}

// Add song to recently played list
function addToRecentlyPlayed(song) {
    // Remove if already exists to avoid duplicates
    recentlyPlayed = recentlyPlayed.filter(s => s.id !== song.id);
    // Add to beginning of array
    recentlyPlayed.unshift(song);
    // Keep only last 20 songs
    if (recentlyPlayed.length > 20) {
        recentlyPlayed = recentlyPlayed.slice(0, 20);
    }
}

// Toggle favorite status
function toggleFavorite(songId) {
    const song = songsData.find(s => s.id === songId);
    if (song) {
        song.favorite = !song.favorite;
        updatePlaylist();
    }
}

// Search functionality
function searchSongs(query) {
    query = query.toLowerCase().trim();
    if (!query) {
        filteredSongs = getFilteredSongs();
    } else {
        const allSongs = getFilteredSongs();
        filteredSongs = allSongs.filter(song =>
            song.title.toLowerCase().includes(query) ||
            song.artist.toLowerCase().includes(query)
        );
    }
    updatePlaylist();
}

// Get filtered songs based on current tab
function getFilteredSongs() {
    switch (currentTab) {
        case 'favorites':
            return songsData.filter(song => song.favorite);
        case 'recent':
            return recentlyPlayed;
        default:
            return songsData;
    }
}

// Update playlist display
function updatePlaylist() {
    console.log('Updating playlist with', filteredSongs.length, 'songs');
    playlist.innerHTML = '';
    
    if (filteredSongs.length === 0) {
        const emptyMessage = currentTab === 'favorites' ? 'No favorite songs yet' : 
                           currentTab === 'recent' ? 'No recently played songs' : 'No songs found';
        playlist.innerHTML = `<div style="text-align: center; padding: 40px; color: rgba(255,255,255,0.5);">${emptyMessage}</div>`;
        return;
    }

    filteredSongs.forEach((song, index) => {
        const songItem = document.createElement('div');
        songItem.className = 'song-item';
        
        // Check if this song is currently playing
        const currentSong = filteredSongs[currentSongIndex];
        if (currentSong && song.id === currentSong.id) {
            songItem.classList.add('active');
        }

        songItem.innerHTML = `
            <img src="${song.image}" alt="${song.title}" class="song-image" 
                 onerror="this.src='https://via.placeholder.com/50x50/666/fff?text=♪'">
            <div class="song-info">
                <h4>${song.title}</h4>
                <p>${song.artist}</p>
            </div>
            <button class="favorite-btn ${song.favorite ? 'active' : ''}" data-id="${song.id}">
                ${song.favorite ? '❤️' : '🤍'}
            </button>
        `;

        // Add click event to play song
        songItem.addEventListener('click', (e) => {
            if (!e.target.classList.contains('favorite-btn')) {
                console.log('Playing song:', song.title);
                currentSongIndex = index;
                loadSong(index);
                updatePlaylist(); // Refresh to show active state
            }
        });

        // Add favorite button functionality
        const favoriteBtn = songItem.querySelector('.favorite-btn');
        favoriteBtn.addEventListener('click', (e) => {
            e.stopPropagation();
            toggleFavorite(parseInt(e.target.dataset.id));
        });

        playlist.appendChild(songItem);
    });
    
    console.log('Playlist updated, DOM contains', playlist.children.length, 'song items');
}

// Voice search functionality
function startVoiceSearch() {
    if ('webkitSpeechRecognition' in window || 'SpeechRecognition' in window) {
        const SpeechRecognition = window.SpeechRecognition || window.webkitSpeechRecognition;
        const recognition = new SpeechRecognition();
        
        recognition.continuous = false;
        recognition.interimResults = false;
        recognition.lang = 'en-US';

        voiceBtn.classList.add('recording');
        voiceBtn.textContent = '🔴';

        recognition.onresult = function(event) {
            const searchQuery = event.results[0][0].transcript;
            searchInput.value = searchQuery;
            searchSongs(searchQuery);
        };

        recognition.onend = function() {
            voiceBtn.classList.remove('recording');
            voiceBtn.textContent = '🎤';
        };

        recognition.onerror = function(event) {
            console.log('Speech recognition error:', event.error);
            voiceBtn.classList.remove('recording');
            voiceBtn.textContent = '🎤';
            alert('Voice search failed. Please try again.');
        };

        recognition.start();
    } else {
        alert('Voice search is not supported in your browser');
    }
}

// Event listeners
playPauseBtn.addEventListener('click', togglePlayPause);
nextBtn.addEventListener('click', nextSong);
prevBtn.addEventListener('click', prevSong);
progressBar.addEventListener('click', setProgress);

// Volume control
volumeSlider.addEventListener('input', (e) => {
    const volume = e.target.value / 100;
    audio.volume = volume;
    volumeDisplay.textContent = e.target.value + '%';
});

// Search functionality
searchInput.addEventListener('input', (e) => {
    searchSongs(e.target.value);
});

// Voice search
voiceBtn.addEventListener('click', startVoiceSearch);

// Shuffle button
shuffleBtn.addEventListener('click', () => {
    isShuffled = !isShuffled;
    shuffleBtn.classList.toggle('active', isShuffled);
});

// Repeat button
repeatBtn.addEventListener('click', () => {
    isRepeating = !isRepeating;
    repeatBtn.classList.toggle('active', isRepeating);
});

// Tab switching
tabs.forEach(tab => {
    tab.addEventListener('click', () => {
        tabs.forEach(t => t.classList.remove('active'));
        tab.classList.add('active');
        currentTab = tab.dataset.tab;
        filteredSongs = getFilteredSongs();
        searchInput.value = '';
        updatePlaylist();
    });
});

// Audio event listeners
audio.addEventListener('timeupdate', updateProgress);
audio.addEventListener('loadedmetadata', updateProgress);

audio.addEventListener('ended', () => {
    if (isRepeating) {
        audio.currentTime = 0;
        audio.play().catch(e => console.log('Audio play failed:', e));
    } else {
        nextSong();
    }
});

audio.addEventListener('canplaythrough', () => {
    totalTime.textContent = formatTime(audio.duration);
});

// Keyboard shortcuts
document.addEventListener('keydown', (e) => {
    // Prevent shortcuts when typing in search input
    if (document.activeElement === searchInput) return;
    
    switch(e.key) {
        case ' ':
        case 'Spacebar':
            e.preventDefault();
            togglePlayPause();
            break;
        case 'ArrowRight':
            e.preventDefault();
            nextSong();
            break;
        case 'ArrowLeft':
            e.preventDefault();
            prevSong();
            break;
        case 'ArrowUp':
            e.preventDefault();
            const currentVol = Math.min(100, parseInt(volumeSlider.value) + 10);
            volumeSlider.value = currentVol;
            audio.volume = currentVol / 100;
            volumeDisplay.textContent = currentVol + '%';
            break;
        case 'ArrowDown':
            e.preventDefault();
            const newVol = Math.max(0, parseInt(volumeSlider.value) - 10);
            volumeSlider.value = newVol;
            audio.volume = newVol / 100;
            volumeDisplay.textContent = newVol + '%';
            break;
        case 'f':
        case 'F':
            // Toggle favorite for current song
            if (filteredSongs[currentSongIndex]) {
                toggleFavorite(filteredSongs[currentSongIndex].id);
            }
            break;
        case 's':
        case 'S':
            // Toggle shuffle
            isShuffled = !isShuffled;
            shuffleBtn.classList.toggle('active', isShuffled);
            break;
        case 'r':
        case 'R':
            // Toggle repeat
            isRepeating = !isRepeating;
            repeatBtn.classList.toggle('active', isRepeating);
            break;
    }
});

// Initialize the app
function init() {
    console.log('Initializing music player...');
    updateVisitorCounter();
    filteredSongs = [...songsData]; // Ensure filteredSongs is set
    loadSong(0);
    updatePlaylist();
    console.log('App initialized with', songsData.length, 'songs');
    
    // Show keyboard shortcuts info
    console.log('Keyboard shortcuts:');
    console.log('Space - Play/Pause');
    console.log('Arrow Left/Right - Previous/Next song');
    console.log('Arrow Up/Down - Volume up/down');
    console.log('F - Toggle favorite');
    console.log('S - Toggle shuffle');
    console.log('R - Toggle repeat');
}

// Make sure DOM is loaded before initializing
if (document.readyState === 'loading') {
    document.addEventListener('DOMContentLoaded', init);
} else {
    init();
}