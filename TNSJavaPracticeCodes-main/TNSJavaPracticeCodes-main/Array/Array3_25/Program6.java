import java.util.*;
class ArrayDemo{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array :");

		int size=sc.nextInt();

		System.out.println("Enter array elemnets :");
		char arr[]=new char[size];

		for(int i=0;i<size;i++){

			arr[i]=sc.next().charAt(0);

		}
		System.out.println("Consonants in Array is :");

		for(int i=0;i<size;i++){
			if(arr[i]!='a' && arr[i]!='e' && arr[i]!='i' && arr[i]!='o' && arr[i]!='u' && arr[i]!='A' && arr[i]!='E' && arr[i]!='I' && arr[i]!='O' && arr[i]!='U'){
				
			

		
			System.out.print(arr[i]);
			}
		}
			

		
	}
}


