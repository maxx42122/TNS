import java.util.*;
class SpaceDemo{
        public static void main(String[]args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter no.of rows :");
                int row=sc.nextInt();

                for(int i=1;i<=row;i++){

                        for(int sp=row;sp>i;sp--){


                                System.out.print("  ");
                        }
                        int num=1;
                        for(int j=1;j<=i;j++){

                                System.out.print(num +" ");
                                num++;

                        }

                        System.out.println();
                }
        }
}










/*import java.util.*;
class SpaceDemo{
        public static void main(String[]args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter no.of rows :");
                int row=sc.nextInt();

                for(int i=1;i<=row;i++){
			int num =1;

                        for(int sp=row;sp>i;sp--){


                                System.out.print("\t ");
                        }
                        
                        for(int j=1;j<=i*2-1;j++){

				if(j<i){

                                System.out.print((num+=2) +"\t");

				}
				else{
					System.out.print((num-=2) +"\t");

				}

                        }

                        System.out.println();
                }
        }
}*/
