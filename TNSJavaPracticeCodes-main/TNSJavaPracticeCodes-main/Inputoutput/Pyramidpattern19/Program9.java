import java.util.*;
class PyramidDemo{
        public static void main(String[]args){
                Scanner sc =new Scanner(System.in);
                System.out.print("Enter the row:");
                int row=sc.nextInt();



                for(int i=1;i<=row;i++){
                        char ch1='a';
			char ch2='A';


                       for(int sp=row;sp>i;sp--){

                System.out.print("\t");
                       }



                for(int j=1;j<=i*2-1;j++){
			if(i%2==0){

                       	 	if(i>j){
                                	System.out.print(ch1++ +"\t");
                        	}
                        	else{

                                	System.out.print(ch1-- +"\t");

                      	}
				}
			else{
				
                        	if(i>j){
                        	        System.out.print(ch2++ +"\t");
                        	}
                        	else{

                                	System.out.print(ch2-- +"\t");

                      }
			}

                }

              System.out.println();
                }

        }
}
