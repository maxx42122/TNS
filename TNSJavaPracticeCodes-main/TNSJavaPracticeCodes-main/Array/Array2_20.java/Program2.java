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

        

        int sum=0;
	System.out.print("Elements divisible by 3 is:");

        for(int i=0;i<size;i++){

                if(arr[i]%3==0){
                        

                System.out.print(arr[i] +"\t ");
		sum+=arr[i];
                }


        }
	System.out.println();
        System.out.println("sum of element divisible by 3 :"+sum);
        }
}
