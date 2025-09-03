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

                int count=0;
              System.out.print("enter number to check :");
                char num=sc.next().charAt(0);

                for(int i=0;i<size;i++){
		
				if(arr[i]==num){
					count++;
					
				}
				}
		System.out.println(num +" occurs " +count +" times in the array");

			
             }

        
}
