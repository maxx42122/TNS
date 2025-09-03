class WhileDemo{
        public static void main(String[]args){

                int num =23456;
		int sum=0;

                while(num>0){
                        int digit=num%10;

                        if(digit%2==0){

				sum=sum+digit;

                        
                        }

                        num/=10;
                }
		System.out.println(sum);
        }
}
