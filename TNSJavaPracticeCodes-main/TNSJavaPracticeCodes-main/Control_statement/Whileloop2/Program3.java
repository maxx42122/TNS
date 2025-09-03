class WhileDemo{
        public static void main(String[]args){

                int num =436780521;

                while(num>0){
                        int digit=num%10;

                        if((digit%2==0||digit%3==0)&&digit!=0){

                        System.out.println(digit);
                        }

                        num/=10;
                }
        }
}
