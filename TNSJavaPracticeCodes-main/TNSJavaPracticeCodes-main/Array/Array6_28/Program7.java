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



			

                

                for(int i=0;i<size;i++){

                                if(arr[i]>65||arr[i]<90||arr[i]>97||arr[i]<122){

                                        System.out.print((char)arr[i] +"\t"); 
                                        

                                }
                                else{
                                        System.out.print(arr[i] +"\t");

                                }
                }
	}
}
