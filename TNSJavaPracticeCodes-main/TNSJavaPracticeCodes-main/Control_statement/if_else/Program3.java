class Even{
        public static void main(String[]args){
                int num = 8;

                if(num%2==0 && num>10){
                        System.out.println(num+"=is a even number and greater than 10");
                }

		else if(num%2==0 && num<10){
                        System.out.println(num+"=is a even number and less than 10");
		}
                else if(num%2!=0 && num>10){ 
                        System.out.println(num+"=is a odd number and greater than 10");

		}
		 else if(num%2!=0 && num<10){
                        System.out.println(num+"=is a odd number and less than 10");
		 }

		else {
                        System.out.println(num+"invalid input");
                }
		
}

}
