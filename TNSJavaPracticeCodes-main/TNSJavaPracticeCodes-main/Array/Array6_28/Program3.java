import java.util.*;
class ArrayDemo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter size of Arrays :");
		int size=sc.nextInt();

		System.out.println("Enter size of Arrays :");
		int arr[]=new int[size];

		for(int i=0;i<size;i++){

			arr[i]=sc.nextInt();
		}

		System.out.println("enter search key:");
		int key=sc.nextInt();
		int count=0;

		for(int i=0;i<size;i++){

			if(key==arr[i]){
				count++;
				arr[i]=(key*key*key);

			}
			else{
				System.out.println("element is not found ");
			}

		}
		if(count>2){
			//arr[i]=(key*key*key);
		}
		System.out.print("new array elemnts is :" );

		for(int i=0;i<size;i++){

			System.out.print(arr[i] +"\t");
		}
	}
}











	      	


