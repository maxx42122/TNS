import java.io.*;
class Pattern{
	public static void main(String[]args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter number of rows: ");
		int row=Integer.parseInt(br.readLine());

		for(int i=0;i<row;i++){

			for (int j=0;j<=i;j++){

				System.out.print("* ");

			}
			System.out.println();
		}
	}
}
				
