import java.util.*;
class SpaceDemo{
        public static void main(String[]args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter no.of rows :");
                int row=sc.nextInt();

                for(int i=1;i<=row;i++){
			int ch=65+row-i;

                        for(int sp=row;sp>i;sp--){


                                System.out.print("\t");
                        }
                        
                        for(int j=1;j<=i;j++){

                               System.out.print((char)ch++ +"\t");
                                

                        }


                        System.out.println();
                }
        }
}
