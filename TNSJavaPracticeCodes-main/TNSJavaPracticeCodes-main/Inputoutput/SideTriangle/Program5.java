import java.util.*;
class SideTriangleDemo{
        public static void main(String[]args){

                Scanner sc=new Scanner(System.in);
                System.out.println("Enter no.of rows :");
                int row=sc.nextInt();

                int col=0;
                int ch=64+row;


                for(int i=1;i<row*2;i++){


                        if(i<=row){
                                col=i;


                        }
                        else{
                                col=row*2-i;


                        }
                        for(int j=1;j<=col;j++){

                                System.out.print((char)	ch+"\t");

                        }
                         if(i<row){

                                ch--;

                        }
                        else{

                                ch++;
                        }
			System.out.println();

		}
	}
}
