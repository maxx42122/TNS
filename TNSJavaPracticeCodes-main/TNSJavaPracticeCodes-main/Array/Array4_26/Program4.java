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

                int count=0;
		System.out.print("enter number to check :");
		int num=sc.nextInt();

                for(int i=0;i<size;i++){
                        if(num==arr[i]){
                                count++;
                 }
                }
              if(count>=2){
		      System.out.print(num +" occurs more than 2 times in the array");
	      }
	      else{
		     System.out.print(num +" not occurs more than 2 time ");
	      } 

        }
}
