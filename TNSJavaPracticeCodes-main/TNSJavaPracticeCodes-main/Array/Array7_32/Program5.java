import java.io.*;

class ArrayDemo{
	public static void main(String[]args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter no.of Rows :");
		int row=Integer.parseInt(br.readLine());
		System.out.println("Enter no.of Column :");
		int col=Integer.parseInt(br.readLine());

		int arr[][]=new int[row][col];

		for(int i=0;i<row;i++){

			for(int j=0;j<col;j++){

				System.out.println("Enter element in row  " +(i+1) +"and in column " +(j+1) +" :");
				arr[i][j]=Integer.parseInt(br.readLine());

			}
		}
		
	


		for(int j=0;j<col;j++){
			int sum=0;

			for(int i=0;i<row;i++){

				
					sum+=arr[i][j];
			}
				
			System.out.print("Sum of column " +(j+1) +" is " +sum +"\t");
			}



			}

	}





