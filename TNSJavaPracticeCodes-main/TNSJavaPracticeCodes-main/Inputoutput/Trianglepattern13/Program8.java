import java.io.*;
class Pattern{
	public static void main(String[]args)throws IOException{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter no. rows :");
		int row=Integer.parseInt(br.readLine());
			int num=row;
			int ch=64 +row;

		for(int i=1;i<=row;i++){

			for(int j=1;j<=row-i+1;j++){

				if(i%2==1){
					System.out.print(num +"  ");
					
				}
				else{
					System.out.print((char)ch +"  ");

					

				}
				ch--;
				num--;
				
				
			}
		
					
			num+=(row-i);
			ch+=(row-i);
			
			
			System.out.println();
		}
	}
}
