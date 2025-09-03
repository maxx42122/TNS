import java.util.*;
class ArrayDemo{
        public static void main(String[]args){
                Scanner sc =new Scanner(System.in);
                System.out.print("Enter the Size of array :");
                int size=sc.nextInt();

                System.out.println("Enter element Array :");
                int arr[]=new int[size];

                for(int i=0;i<size;i++){

                        arr[i]=sc.nextInt();
                }

                System.out.println("enter key :");
		int key=sc.nextInt();

                for(int i=0;i<size;i++){

                                if(arr[i]%key==0){

                                        System.out.println("An element multiple of " +key +"found at index " +i);
				}
			}
					
					
		
		
	}
}
                                        
                                
                               
