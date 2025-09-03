import java.io.*;
class Pattern{
	public static void main(String[]args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no.of rows :");
		int row=Integer.parseInt(br.readLine());
		

		

		for(int i=1;i<=row;i++){
			int num=i;

			for(int j=1;j<=i;j++){

				System.out.print(num +"  ");
				num+=i;

			}
			
			System.out.println();
		}
	}
}


