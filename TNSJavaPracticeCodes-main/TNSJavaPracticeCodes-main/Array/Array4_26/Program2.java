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

                int min=arr[0];
                for(int i=0;i<size;i++){
			if(min>=arr[i]){
				min=arr[i];
		 }
		}
		 int max=arr[0];                                                                         for(int i=0;i<size;i++){
                        if(max<=arr[i]){
                                max=arr[i];                                                              }
		 }      

                int difference=max-min;

                System.out.println("Difference is:" +difference);

        }
}
