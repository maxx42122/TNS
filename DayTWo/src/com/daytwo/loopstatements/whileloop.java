package com.daytwo.loopstatements;

public class whileloop {

	public static void main(String[] args) {
		int num=1235423;
		int count=0;
		while(num!=0){
			count++;
			num/=10;
		}
		System.out.println(num);
		System.out.println(count);


	}

}
