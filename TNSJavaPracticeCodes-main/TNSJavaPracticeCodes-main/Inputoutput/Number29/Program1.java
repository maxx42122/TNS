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
		if(num==sum){
			System.out.println(num +"is a perfect number");

		}
		else{
			System.out.println("it is not perfect number");
		}
	}
}

