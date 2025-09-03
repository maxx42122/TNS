import java.io.*;
class Pattern{
        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter number of rows: ");
                int row=Integer.parseInt(br.readLine());
		int num=row;
                for(int i=1;i<=row;i++){
			

                        for (int j=row;j>=i;j--){
			

                                System.out.print(num +" ");

                        }
			num--;
                        System.out.println();
                }
        }
}
