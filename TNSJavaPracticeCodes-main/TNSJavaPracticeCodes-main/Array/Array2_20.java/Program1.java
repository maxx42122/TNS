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

        System.out.println("even numbers :");

	int cnt=0;

        for(int i=0;i<size;i++){

                if(arr[i]%2==0){
			cnt++;

                System.out.print(arr[i] +", ");
                }


        }
	System.out.println("Count :"+cnt);
        }
}
