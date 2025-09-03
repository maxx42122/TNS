import java.io.*;
class Pattern{

        public static void main(String[]args)throws IOException{
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter number of rows :");
                int Row=Integer.parseInt(br.readLine());

                int ch=97;
                for(int i=1;i<=Row;i++){
                        int num=Row+1;


                        for(int j=1;j<=i;j++){

                                if(j%2==0){

                                        System.out.print((char)ch +"  ");
						ch++;

                                }

                                else{
                                        System.out.print(num +"  ");
                                }
                                num++;
                                

                        }


                        System.out.println();
                }
        }
}
