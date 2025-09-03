import java.util.*;
class numDemo{
        public static void main(String[]args){
                Scanner sc=new Scanner(System.in);
                int num=sc.nextInt();
                        int sum=0;
                        


                        for(int i=num-1;i>0;i--){

                              if(num%i==0){
	  			sum+=i;
			      }
			}
                       
                if(sum<num){
                        System.out.println(num +" it is a dificient number");
                }
                else{
                        System.out.println(num +" it is not a dificient number");
                }
        }
}
