import java.io.*;
class Pattern{
	public static void main(String[]args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter no. of rows: ");

		int row=Integer.parseInt(br.readLine());

		for(int i=1;i<=row;i++){
			int ch=96+row;
			int num=row;

			for(int j=1;j<=i;j++){

				if(i%2==1){
				
				System.out.print((char)ch-- +"  ");
				}
				else{
					System.out.print(num-- +"  ");
				}
			}
			System.out.println();
			}
	}
}


