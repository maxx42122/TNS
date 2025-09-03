import java.util.*;
class ArrayDemo{
        public static void main(String[]args){
                Scanner sc =new Scanner(System.in);
                System.out.print("Enter the Size of array :");
                int size=sc.nextInt();

                System.out.println("Enter element Array :");
                int arr[]=new int[size];

		int flag=0;

                for(int i=0;i<size;i++){

                        arr[i]=sc.nextInt();
                }



                for(int i=0;i<size/2;i++){

                                if(arr[i]==arr[size-i-1]){

                                       flag=1;

                                }
                                else{

                                      flag=0;

                                }
                }

		if(flag==1){

                        System.out.println("given array is palindrome :" );
		}
		else{


                System.out.println(" given array is not pallindrome :" );
		}
        }
}
