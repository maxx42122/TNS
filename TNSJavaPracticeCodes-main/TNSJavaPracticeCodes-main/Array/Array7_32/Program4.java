import java.io.*;
class ArrayDemo{
        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter no. of row :" );
                int row=Integer.parseInt(br.readLine());

                System.out.println("Enter no. of column :" );
                int col=Integer.parseInt(br.readLine());

                int arr[][]=new int[row][col];

                for(int i=0;i<row;i++){

                        for(int j=0;j<col;j++){

                                System.out.println("Enter elements in row  " +(i+1) +"column   " +(j+1) +" : ");
                                arr[i][j]=Integer.parseInt(br.readLine());

                        }
                }
                int sum=0;

                for(int i=0;i<row;i++){


                        for(int j=0;j<col;j++){

                              sum+=arr[i][j];


                        }
			if(i%2==0){
                        System.out.println("sum of row " +(i+1) +" = " +sum);
			}
                        System.out.println();
                }
        }
}

