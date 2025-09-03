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

        for(int i=0;i<size;i++){

                if(arr[i]>5 && arr[i]<9){
			System.out.println(arr[i] +" is greater than 5 but less than9");
                        

        }
        
        }
	}
}
