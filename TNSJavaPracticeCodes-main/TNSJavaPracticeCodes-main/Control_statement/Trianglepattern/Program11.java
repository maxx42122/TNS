import java.io.*;
class Pattern{
        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter number of rows: ");
                int row=Integer.parseInt(br.readLine());

                for(int i=1;i<=row;i++){
			int ch =64+i;

                        for (int j=row;j>=i;j--){
			
			if(i%2==1){

				if(j%2==1){


                                System.out.print((char)ch +" ");

                        }
			else{

				System.out.print(ch +" ");
			}
			}

			else{

				if(j%2==0){


                                System.out.print((char)ch +" ");

                        }
			else{

				System.out.print(ch +" ");
			}
			}



			ch++;
			}
                        System.out.println();
                          
		
		}
        }
}
