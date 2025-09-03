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


              
                     System.out.println((arr[i]+1) +"\t");
	       }

                                
	}
}
