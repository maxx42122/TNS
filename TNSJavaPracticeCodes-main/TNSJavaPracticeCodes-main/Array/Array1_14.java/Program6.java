import java.util.*;
class ArrayDemo{
        public static void main(String[]args){

                Scanner sc=new Scanner (System.in);
                System.out.println("Enter the size of Array :");
                int size=sc.nextInt();

                System.out.println("Enter Array elements :");
                char arr[]=new char[size];

        for(int i=0;i<size;i++){

                arr[i]=sc.next().charAt(0);
        }

        System.out.println("Display Array :");

        for(int i=0;i<size;i++){

                System.out.println(arr[i]);

        }
        }
}
