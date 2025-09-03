import java.io.*;

class Pattern{
	public static void main(String[]args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no.of Rows :");
		int row=Integer.parseInt(br.readLine());

		int num=row;
		for(int i=1;i<=row;i++){

			for(int j=1;j<=i;j++){

				System.out.print(num +" ");
					num+=(row-i+1);
			}
			num=(row-i);
			System.out.println();

                        
		}	
 	}
}

