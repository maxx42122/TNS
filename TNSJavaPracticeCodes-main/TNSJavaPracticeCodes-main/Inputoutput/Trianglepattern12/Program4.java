import java.io.*;
class Pattern{

        public static void main(String[]args)throws IOException{
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter number of rows :");
                int row=Integer.parseInt(br.readLine());



                for(int i=1;i<=row;i++){
                        int num =0;
                        int ch=64+row;


                        for(int j=1;j<=i;j++){
                                num++;

                               

                                        System.out.print((char)ch +" ");

                           
                                ch--;

                        }
                        System.out.println();
                }
        }
}
