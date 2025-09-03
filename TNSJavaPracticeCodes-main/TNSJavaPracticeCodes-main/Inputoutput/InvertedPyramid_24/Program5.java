import java.util.*;
class InvertedDemo{
        public static void main(String[]args){
                Scanner sc=new Scanner(System.in);
                System.out.println("enter no.of rows :");
                int row=sc.nextInt();


		char ch='A';
                for(int i=row;i>=1;i--){
                        

                        for(int sp=1;sp<=(row-i);sp++){

                                System.out.print("\t");
                        }

                        for(int j=1;j<=(i*2)-1;j++){

                                System.out.print(ch +"\t");

                        }
			ch++;
                        System.out.println();
                }
        }
}                 
