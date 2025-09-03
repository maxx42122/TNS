class WhileDemo{
        public static void main(String[]args){

                int num =2469185;
		int sum =0;
		int square=0;

                while(num>0){
                        int digit=num%10;

                        if(digit%2==1){

                        square=digit*digit;
                       
			sum=sum+square;

			}

                        num/=10;
                }
		System.out.println(sum);
        }
}
