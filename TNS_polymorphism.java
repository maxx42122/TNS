import java.util.Scanner;

class TicketBooking{
  private  String stageEvent;
   private String customer;
   private int noOfSeats;

   public String getStageEvent() {
    return stageEvent;
}


   public void setStageEvent(String stageEvent) {
    this.stageEvent = stageEvent;
   }


   public String getCustomer() {
    return customer;
   }


   public void setCustomer(String customer) {
    this.customer = customer;
   }


   public int getNoOfSeats() {
    return noOfSeats;
   }


   public void setNoOfSeats(int noOfSeats) {
    this.noOfSeats = noOfSeats;
   }


//    TicketBooking(String stageEvent,String customer,int noOfSeats  ){
//     this.stageEvent=stageEvent;
//     this.customer=customer;
//     this.noOfSeats=noOfSeats;
//    };


   public void makePayment(Double amount){
    System.out.println("______________Your Ticket_______________________");
  //  System.out.println("This methos is for cash payment\n This method acepts amount as input and \n displays transaction detail");
    System.out.println("Stage Event:"+ getStageEvent());
     System.out.println("Customer :"+ getCustomer());
      System.out.println("Number Of Seats:"+ getNoOfSeats());
      System.out.println("Amount "+amount+" paid in cash:");

   }
    public void makePayment(String walletNumber,Double amount){
         System.out.println("______________Your Ticket__________________");
   // System.out.println("This methos is for wallet payment\n This method acepts wallet number and amount as input and \n displays transaction detail");
      System.out.println("Stage Event:"+ getStageEvent());
     System.out.println("Customer :"+ getCustomer());
      System.out.println("Number Of Seats:"+ getNoOfSeats());
      System.out.println("Amount "+amount+" paid using wallet number " + walletNumber);
   }
    public void makePayment(String creditCardno,String ccv,String Name,Double amount){
         System.out.println("______________Your Ticket__________________");
   // System.out.println("This methos is for card payment\n This method aceptscredit card detail and amount as input and \n displays transaction detail");
      System.out.println("Stage Event:"+ getStageEvent());
     System.out.println("Customer :"+ getCustomer());
      System.out.println("Number Of Seats:"+ getNoOfSeats());
      System.out.println("Amount "+amount+" paid using Master card  " + ccv );
   }

}

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     
        TicketBooking obj=new TicketBooking();
        System.out.println("Enter Show Name :");
        obj.setStageEvent(sc.nextLine());
          System.out.println("Enter your Name :");
        obj.setCustomer(sc.nextLine());
          System.out.println("Enter no. of Seats :");
        obj.setNoOfSeats(sc.nextInt());
        
        
        System.out.println("Enter your choice for Payment: \n 1:Cash payment \n 2:Wallet payment \n 3.Credit card payment");
        int choice=sc.nextInt();

        if(choice==1){

              System.out.println("Enter Amount  :");
            obj.makePayment(sc.nextDouble());
        }else if(choice==2){
           
             
                 System.out.println("Enter  Wallet Detail :");
              String wl=sc.nextLine();
               System.out.println("Enter Amount:");
              Double am=sc.nextDouble();
            obj.makePayment(wl,am);
         

        }else if(choice==3){
            
            System.out.println("Enter  Credit card Number:");
            String wl=sc.nextLine();
            System.out.println("Enter CVV:");
            String cvv=sc.nextLine();
            System.out.println("Enter your Name:");
            String name=sc.nextLine();
            System.out.println("Enter Amount:");
            Double am=sc.nextDouble();
        
            obj.makePayment(wl,cvv,name,am);

        }else{
            System.out.println("Invalid Choice");
        }


        
    }
}