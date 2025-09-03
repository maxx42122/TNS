import java.io.*;
class Pattern{
	public static void main(String[]args )throws IOException{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter no. of rows");
		int row=Integer.parseInt(br.readLine());
		int num=1;
		for(int i=1;i<=row;i++){

			for(int j=row;j>=i;j--){
				System.out.print( num+" ");
				num++;
			}
			num=i+1;
			System.out.println();
		}
	}
}
