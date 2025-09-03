import java.util.*;
class Numdemo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int num=sc.nextInt();
		int Factorial=num;

		for(int i=1;i<num;i++){

			Factorial*=(num-i);
			

		}
		

		System.out.print("Factorail of " +num +" is " + Factorial );
	}
}


