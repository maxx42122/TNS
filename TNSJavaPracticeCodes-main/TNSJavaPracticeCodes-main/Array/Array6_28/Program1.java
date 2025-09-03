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

                int flag=0;
                int min=arr[0];

                for(int i=0;i<size;i++){

                                if(min>=arr[i]){
                                        min=arr[i];
                                        flag=1;

                                }
                                else{
                                        flag=0;
                                        break;

                                }
                }
                if(flag==1){
                        System.out.println("given array is in descending Order :");
                }
                else{

                System.out.println(" given Array is not in  decending order");
		}
	}
}
