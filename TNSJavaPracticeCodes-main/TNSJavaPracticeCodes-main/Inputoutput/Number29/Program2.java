import java.util.*;
class numDemo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
			int sum=0;
			int num1=num;
			

		while(num>0){
			int Product=1;
			int digit=num%10;
			for(int i=digit;i>0;i--){

				Product*=i;
			}
			System.out.println("Product is=" +Product);
			sum+=Product;
			num/=10;
		}
		if(sum==num1){
			System.out.println(num1 +" it is a strong number");
		}
		else{
			System.out.println(num1 +" it is not a strong number");
		}
	}
}
			
