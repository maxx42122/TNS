import java.io.*;
class Pattern{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter bo.of rows :");
		int row=Integer.parseInt(br.readLine());
		
		int ch1=64+row;
		int ch2=96+row;
		for(int i=1;i<=row;i++){
			

			for(int j=1;j<=row-i+1;j++){

				if(row%2==0){

				if(i%2==1){

				System.out.print((char)ch1 +"  ");
				}
				else{
					System.out.print((char)ch2 +"  ");
				}
				ch1--;
				ch2--;
			}
			
			else{

                              

                                if(i%2==0){

                                System.out.print((char)ch1 +"  ");
                                }
                                else{
                                        System.out.print((char)ch2 +"  ");
                                }
                                ch1--;
                                ch2--;
                        }
                        }
			ch1+=(row-i);
			ch2+=(row-i);
			System.out.println();
		}
	}
}


