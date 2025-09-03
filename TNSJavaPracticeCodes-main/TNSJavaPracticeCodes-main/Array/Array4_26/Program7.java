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

                
                for(int i=0;i<size;i++){
                        if((int)arr[i]>=97&& (int)arr[i]<=122){

			arr[i]-=32;
                                
                 }
                	}
		System.out.println("after convert in uppercase :");
	       for(int i=0;i<size;i++){
	       		System.out.print(arr[i] +"\t");
	       }		


                
                
        }
}
