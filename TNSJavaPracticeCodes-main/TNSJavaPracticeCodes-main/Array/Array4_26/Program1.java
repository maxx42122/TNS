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

		int sum=0;
		for(int i=0;i<size;i++){

			sum+=arr[i];
		}

		int average=sum/size;

		System.out.println("average of given element :" +average);
	
	}
}
