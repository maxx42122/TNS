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


                int digit=0;
                

                for(int i=0;i<size;i++){
			int count=0;
			int num=arr[i];

                                while(num>0){
					digit=num%10;
					count++;
					num/=10;
				}
		

               System.out.println(" digit of array element is :" +count);
		}
        }
}
