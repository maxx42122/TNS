import java.util.*;
class ArrayDemo{
        public static void main(String[]args){

                Scanner sc=new Scanner (System.in);
                System.out.println("Enter the size of Array :");
                int size=sc.nextInt();

                System.out.println("Enter Array elements :");
                int arr[]=new int[size];

        for(int i=0;i<size;i++){

                arr[i]=sc.nextInt();
        }



        int product=1;

        for(int i=0;i<size;i++){

                if(i%2==1){
                        product*=arr[i];


                }


        }
        System.out.println("Product of odd indexed elements:"+product);
        }
}
