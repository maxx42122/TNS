import java.util.*;
class SpaceDemo{
        public static void main(String[]args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter no.of rows :");
                int row=sc.nextInt();

		int num=1;                

                for(int i=1;i<=row;i++){

			

                        for(int sp=1;sp<i;sp++){


                                System.out.print("\t");
                        }


                        for(int j=row;j>=i;j--){

                                System.out.print(num++ +"\t");


                        }
                        num-=(row-i);

                        System.out.println();
                }
        }
}
