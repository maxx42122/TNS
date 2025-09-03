import java.util.*;
class PyramidDemo{
        public static void main(String[]args){
                Scanner sc =new Scanner(System.in);
                System.out.print("Enter the row:");
                int row=sc.nextInt();
                        
		int num=1;
		char ch='A';



                for(int i=1;i<=row;i++){
                        

                       for(int sp=row;sp>i;sp--){

                System.out.print("\t");
                       }



                for(int j=1;j<=i*2-1;j++){
                        if(i%2==0){
                                System.out.print(ch +"\t");
                        }
                        else{

                                System.out.print(num +"\t");

                      }
                }
		num++;
		ch++;

              System.out.println();
                }

        }
}
