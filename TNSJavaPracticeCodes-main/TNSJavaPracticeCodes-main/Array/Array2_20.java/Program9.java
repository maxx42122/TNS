import java.util.*;
class ArrayDemo{
       public static void main(String[]args){
       
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter size of an array :");

      int size=sc.nextInt();

      System.out.println("Enter array elements :");
      int arr[]=new int[size];
      for(int i=0;i<size;i++){

	      arr[i]=sc.nextInt();
      }

      int min=arr[0];
      for(int i=0;i<size;i++){

	      if(min>arr[i]){
		      min=arr[i];

	      }
      }
      System.out.println("Minimum number in the Array is :" +min);
       }
}
