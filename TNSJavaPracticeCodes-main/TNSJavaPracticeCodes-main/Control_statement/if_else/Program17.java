class Profitloss{
        public static void main(String[]args){
        int sellingPrice = 1200;
        int costPrice = 12200;
	System.out.println("sellingPrice =" +sellingPrice);
	System.out.println( "costPrice =" +costPrice);


        if(sellingPrice > costPrice){
                System.out.println("profit of:" +(sellingPrice - costPrice) );
                }
                else if( sellingPrice < costPrice){
                System.out.println("loss of:" +(costPrice - sellingPrice) );
                }

                else {
                System.out.println(sellingPrice+" == "+costPrice  +"there is no profit or loss");
                }



        }
}
