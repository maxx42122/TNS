class Result2{

        public static void main(String[]args){

        float percentage = 65.00f;
        	if(percentage >=70.00 && percentage <=100 ){
                System.out.println(percentage+" passed : first class with distinction");
                }
                else if(percentage>=60.00 && percentage<70){
                System.out.println(percentage+" passed : first class");

                }

                else if(percentage>=50.00 && percentage<60){
                System.out.println(percentage+" passed : second class ");

                }

		else if(percentage>=35.00 && percentage<50){
                System.out.println(percentage+" pass ");

                }

                else {
                System.out.println(percentage+"  fail");
                }



        }
}
			
