import java.io.*;
class Pattern{
        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                        System.out.println("Enter no. of rows :");


        int row =Integer.parseInt(br.readLine());

              int ch=64+row;
                for(int i=1;i<=row;i++){
			int num=1;
               		
			

                        for(int j=1;j<=row-i+1;j++){

				if(i%2==1){
                                System.out.print(num +"  ");
                                num++;
				}
				else{
					System.out.print((char)ch +"  ");
					
				}
				ch--;
		

			}


			
			ch+=(row-i);
			
                        System.out.println();
                }
        }
}
