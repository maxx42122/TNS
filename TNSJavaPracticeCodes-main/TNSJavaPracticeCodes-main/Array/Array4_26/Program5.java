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

                int temp=0;
                for(int i=0;i<size/2;i++){
                        temp =arr[i];
                        arr[i]=arr[size-i-1];
			arr[size-i-1]=temp;
                 }
		System.out.print("Reversed number is:" );

                  
		for(int i=0;i<size;i++){
                        System.out.println(arr[i]);
		}
	}
                 

                

        
}
