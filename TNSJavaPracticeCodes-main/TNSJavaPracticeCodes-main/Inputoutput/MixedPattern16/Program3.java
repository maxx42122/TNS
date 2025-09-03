import java.io.*;
class Pattern{
	public static void main(String[]args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no.of rows :");
		int row=Integer.parseInt(br.readLine());

		
		for(int i=1;i<=row;i++){
			int ch=64+row;
			int num=1;

			for(int j=1;j<=row;j++){
				if(i%2==0){
					System.out.print(num++ +"  ");
				}
				else{
					System.out.print((char)ch-- +"  ");
				}
			}
			System.out.println();
		}
	}
}






