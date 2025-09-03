import java.util.*;
class ArrayDemo{

	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter Size of rows :");
	int row=sc.nextInt();

	System.out.println("Enter size of column ");
	int col=sc.nextInt();
	
	System.out.println("Enter elements in Array :");
	int arr[][]=new int[row][col];

	for(int i=0;i<row;i++){
		for(int j=0;j<col;j++){

			System.out.println("Enter elements in row " +(i+1) +" and column " +(j+1) + ":");
			arr[i][j]=sc.nextInt();
		}
	}


	for(int i=0;i<row;i++){
		for(int j=0;j<col;j++){

			
			System.out.print(arr[i][j] +"\t");

		}
		System.out.println();

		}
	}
}






	

			

