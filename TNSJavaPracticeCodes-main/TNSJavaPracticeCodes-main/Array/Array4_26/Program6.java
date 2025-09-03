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

                int vowel_count1=0;
		int consonant_count2=0;
                for(int i=0;i<size;i++){
                        if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'){

                                vowel_count1++;
                 }
		 else{
			 consonant_count2++;
                }
                 
              
		}
                System.out.println("count of vowel:" +vowel_count1);
                System.out.println("count of consonant :" +consonant_count2);

        }
}
