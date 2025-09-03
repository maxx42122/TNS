import java.io.*;
class Pattern{

        public static void main(String[]args)throws IOException{
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter number of rows :");
                int Row=Integer.parseInt(br.readLine());



                for(int i=1;i<=Row;i++){
                      
                        int ch1=96+Row;
                        int ch2=64+Row;


                        for(int j=1;j<=i;j++){
                                

                                if(i%2==1){

                                        System.out.print((char)ch1 +" ");

                                }

                                else{

                                        System.out.print((char)ch2 +" ");
                                }
                                ch1--;
                                ch2--;

                        }
                        System.out.println();
                }
        }
}
