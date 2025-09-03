class WhileDemo{
        public static void main(String[]args){

                int num =234;
		int product=1;

                while(num>0){
                        int digit=num%10;

                 	num/=10;
			product=product*digit;
		}

                        System.out.println(product);
                        

                      
                
        }
}
