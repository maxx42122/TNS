import java.util.*;
class InvertedDemo{
        public static void main(String[]args){
                Scanner sc=new Scanner(System.in);
                System.out.println("enter no.of rows :");
                int row=sc.nextInt();


                
                for(int i=row;i>=1;i--){
                 


                        for(int sp=1;sp<=(row-i);sp++){

                                System.out.print("\t");
                        }

                        for(int j=1;j<=(i*2)-1;j++){

                                if(j%2==0){


                                System.out.print("0" +"\t");
                                }
                                else{
                                System.out.print("1" +"\t");
                                }


                        }

                        System.out.println();
                }
        }
}
