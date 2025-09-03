import java.util.*;
class SpaceDemo{
        public static void main(String[]args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter no.of rows :");
                int row=sc.nextInt();

                for(int i=1;i<=row;i++){
                        int ch=64+i;

                        for(int sp=1;sp<i;sp++){


                                System.out.print("\t");
                        }

                        for(int j=row;j>=i;j--){
				if(i%2==0){
					if(j%2==0){
						System.out.print((char)ch +"\t");
					}
					else{
						System.out.print(ch +"\t");
					}
				}
				else{
					if(j%2==0){
                                                System.out.print(ch +"\t");
                                        }
                                        else{
                                                System.out.print((char)ch +"\t");
                                        }
					}
					ch++;
                                               }


                        System.out.println();
                }
        }
}
