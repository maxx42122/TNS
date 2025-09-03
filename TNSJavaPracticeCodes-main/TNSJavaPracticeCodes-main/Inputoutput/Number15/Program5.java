import java.util.*;
class Numdemo{
        public static void main(String[]args){
                Scanner sc=new Scanner(System.in);
                System.out.println("enter the number :");
                long num=sc.nextLong();



                System.out.print("Reverse of" +num +" is "  );
        		for(long i=num;num>0;i++){

					long digit=num%10l;

			
            				    System.out.print( digit );
	
        			                num/=10;
       						 }
	                
        }
}
