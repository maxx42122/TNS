import java.io.*;
class Pattern{
	public static void main(String[]args)throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter no. of rows :");


	int row =Integer.parseInt(br.readLine());

		int  num=2;
		for(int i=1;i<=row;i++){

			for(int j=1;j<=row-i+1;j++){
				System.out.print(num +"  ");
				num+=2;

			}
			System.out.println();
		}
	}
}





