import java.io.*;
class Pattern{

	public static void main(String[]args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no. of rows : ");

		int row=Integer.parseInt(br.readLine());

			int num=row;
			int ch=64+row;
 		

		for(int i=1;i<=row;i++){
			//int num=row;
			//int ch=64+row;

			for(int j=1;j<=row-i+1;j++){
				
				if(j%2==0){


				System.out.print((char)ch +"  ");
				}
				else{
					System.out.print(num +"  ");
				}
				ch--;
				num--;
			
			}
			ch+=(row-i);
			num+=(row-i);
			System.out.println();
		}
	}
}

