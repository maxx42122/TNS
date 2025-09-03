import java.io.*;
class Pattern{

        public static void main(String[]args)throws IOException{
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter number of rows :");
                int Row=Integer.parseInt(br.readLine());

                int ch=65;

                for(int i=1;i<=Row;i++){
                        int num =0;

                        for(int j=1;j<=i;j++){
                                num++;

                                if(i%2==0){

                                        System.out.print((char)ch +"  ");

                                }

                                else{

                                        System.out.print(num +"  ");
                                }
                                ch++;

                        }
                        System.out.println();
                }
        }
}
