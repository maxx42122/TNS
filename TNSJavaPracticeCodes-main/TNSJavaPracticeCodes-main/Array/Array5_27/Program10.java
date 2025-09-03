import java.util.*;
class ArrayDemo{
        public static void main(String[]args){
                Scanner sc=new Scanner(System.in);

                System.out.println("Enter size of Array :");
                int size=sc.nextInt();

                System.out.println("Enter Array elements :");
                int arr[]=new int[size];

                for(int i=0;i<size;i++){

                        arr[i]=sc.nextInt();
                }
               int min1=arr[0];


               for(int i=0;i<size;i++){
		       int fact=1;

		       int num=arr[i];
		       while(num>0){
			       fact*=num;
			       num--;
		       }
		        System.out.println(fact +"\t");

                                }
	}
}
