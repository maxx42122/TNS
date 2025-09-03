import java.io.*;
class Pattern{
        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter no, of rows :");

                int row =Integer.parseInt(br.readLine());
               
                for(int i=1;i<=row;i++){
                	char ch1='A';
			char ch2='a';
                        for(int j=row;j>=i;j--){
				if(i%2==0){

                                System.out.print(ch2 +"  ");

                                ch2++;
				}
				else{
					System.out.print(ch1+"  ");
					ch1++;
				}
                        }

                System.out.println();
                }
        }
}
