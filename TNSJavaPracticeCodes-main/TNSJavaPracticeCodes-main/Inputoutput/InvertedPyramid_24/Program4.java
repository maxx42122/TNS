import java.util.*;
class InvertedDemo{
        public static void main(String[]args){
                Scanner sc=new Scanner(System.in);
                System.out.println("enter no.of rows :");
                int row=sc.nextInt();

                

                for(int i=row;i>=1;i--){
			int num=1;

                        for(int sp=1;sp<=(row-i);sp++){

                                System.out.print("\t");
                        }

                        for(int j=1;j<=(i*2)-1;j++){

                                System.out.print(num++ +"\t");

                        }
                        System.out.println();
                }
        }
}
