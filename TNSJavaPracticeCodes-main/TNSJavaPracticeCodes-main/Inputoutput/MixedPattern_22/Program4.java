import java.util.*;
class MixedPatternDemo{
        public static void main(String[]args){

                Scanner sc=new Scanner (System.in);
                System.out.println("Enter no. of rows :");

                int row=sc.nextInt();

		int flag=0;

		if(row%2==0){
			flag=1;
		}
		else{
			flag=0;
		}
                

                for(int i=1;i<=row;i++){
			int ch1=64+i;
			int ch2=96+i;

			

                        for(int sp=1;sp<i;sp++){

                                System.out.print("\t");
                        }
                        for(int j=1;j<=(row-i+1);j++){
				if(flag==1){
                                System.out.print((char)ch2++ +"\t");
				}
				else{
                                System.out.print((char)ch1++ +"\t");
				}
                        }


                        System.out.println();
                }
        }
}
