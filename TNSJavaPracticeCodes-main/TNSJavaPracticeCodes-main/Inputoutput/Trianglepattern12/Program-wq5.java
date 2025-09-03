import java.io.*;
class Pattern{

        public static void main(String[]args)throws IOException{
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter number of rows :");
                int Row=Integer.parseInt(br.readLine());

		int ch=65+Row;


                for(int i=1;i<=Row;i++){
                       
                        


                        for(int j=1;j<=i;j++){
                                

                               

                                        System.out.print((char)ch +" ");

                          
                                ch++;
			}

                       
                        System.out.println();
		}

                }
       
}
