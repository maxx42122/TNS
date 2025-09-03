import java.util.*;
class SideTriangleDemo{
        public static void main(String[]args){

                Scanner sc=new Scanner(System.in);
                System.out.println("Enter no.of rows :");
                int row=sc.nextInt();

                int col=0;
                int ch=65+row;



                for(int i=1;i<row*2;i++){



                        if(i<=row){
                                col=row-i;


                        }
                        else{
                                col=i-row;


                        }

                        for(int sp=1;sp<=col;sp++){

                                System.out.print("\t");

                        }
                         if(i<=row){

                                col=i;
                                ch-=i;


                        
			 }
			  else{

                                col=(row*2)-i;
                                ch-=(i-row);

                        }


                        for(int j=1;j<=col;j++){

                                System.out.print((char)ch++ +"\t");
                        }


                        System.out.println();
                }
        }
}

