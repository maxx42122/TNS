class Voters_age{
        public static void main(String[]args){
        short num = 10;
        if(num>18){
                System.out.println(num+" valid age for voting");
                }
		else if(num<18 && num>0){
		System.out.println(num+" it is minor ");
		}

                else {
                System.out.println(num+"  invalid age");
                }



        }
}
