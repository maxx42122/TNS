import java.io.*;
class Pattern{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

				System.out.println("enter number of rows :");

				int row =Integer.parseInt(br.readLine());

				for(int i=0;i<=row;i++){
					int num=row;
					for(int j=0;j<=i;j++){
						System.out.print(num +" ");
						num+=row;
					}
				System.out.println();
				}
	
	}
}




