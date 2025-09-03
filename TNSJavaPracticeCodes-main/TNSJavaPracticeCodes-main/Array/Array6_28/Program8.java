import java.util.*;
class ArrayDemo{
        public static void main(String[]args){
                Scanner sc =new Scanner(System.in);
                System.out.print("Enter the Size of array :");
                int size=sc.nextInt();

                System.out.println("Enter element Array :");
                char arr[]=new char[size];

                for(int i=0;i<size;i++){

			

                        arr[i]=sc.next().charAt(0);
                }
		
	
	
		int start = 0;
        	int end = size - 1;
       	 	while (start < end) {
            		char temp = arr[start];
            		arr[start] = arr[end];
            		arr[end] = temp;
            		start++;
            		end--;
        	}
    	

    
        for (int j = 0; j< size; j += 2) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }


               
}

                
