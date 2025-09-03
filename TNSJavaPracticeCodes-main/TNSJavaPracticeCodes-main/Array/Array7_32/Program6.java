import java.util.*;
class ArrayDemo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of rows :");
		int row=sc.nextInt();
		System.out.println("Enter no. of column :");
		int col=sc.nextInt();

		int arr[][]=new int[row][col];
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){

				System.out.println("Enter element in row " +(i+1) +" in column " +(j+1) +" :");
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				if(arr[i][j]%3==0){

				System.out.println(arr[i][j]);
			}
		}
		}
	}
}
