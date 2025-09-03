import java.util.*;
class ArrayDemo{
        public static void main(String[]args){
                Scanner sc =new Scanner(System.in);
                System.out.print("Enter the Size of array :");
                int size=sc.nextInt();

                System.out.println("Enter element Array :");
                int arr[]=new int[size];

                for(int i=0;i<size;i++){

                        arr[i]=sc.nextInt();
                }

  
                int odd_sum=0;
		int even_sum=0;

                for(int i=0;i<size;i++){

                                if(arr[i]%2==0){
                                        
                                        even_sum+=arr[i];

                                }
                                else{
                                       
                                      odd_sum+=arr[i];

                                }
                }
                
                        System.out.println("sum of even element  :" +even_sum);
                

                System.out.println(" sum of odd elements :" +odd_sum);	
	}
}
