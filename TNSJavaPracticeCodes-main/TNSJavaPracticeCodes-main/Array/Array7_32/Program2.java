import java.util.*;
class ArrayDemo{
	public static void main(String[]args){

		Scanner sc=new Scanner (System.in);
		System.out.println("Enter no. of rows :");
		int row =sc.nextInt();
		System.out.println("Enter no. of column :");
		int col =sc.nextInt();

		int arr[][]=new int[row][col];

		for(int i=0;i<row;i++){

			for(int j=0;j<col;j++){

				System.out.println("enter elements in row " +(i+1) +" and column" +(j+1) +" :");
				arr[i][j]=sc.nextInt();

			
			}
		}
			int sum=0;
			
		for(int i=0;i<row;i++){

			for(int j=0;j<col;j++){

				System.out.print(arr[i][j] +"\t");
				sum+=arr[i][j];
			
			}
			System.out.println();
		}
		System.out.println("sum of all elements in array :" +sum);
		}

}

		

