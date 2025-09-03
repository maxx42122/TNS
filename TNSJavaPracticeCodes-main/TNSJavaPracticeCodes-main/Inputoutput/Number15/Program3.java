import java.util.*;
class Numdemo{

	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();

		int count=0;
		for(int i=1;i<=num;i++){

			if(num%i==0){

				count++;
			}

		}
		if(count>2){
			System.out.print(num +"it is a composite number");

		}
		else{
			System.out.print(num +"it is not a composite number");

		}
		
	}
}
