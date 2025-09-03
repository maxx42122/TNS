import java.util.*;
class ArrayDemo{
        public static void main(String[]args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter size of Array :");
                int size=sc.nextInt();

                System.out.println("Enter array elements :");
                int arr[]=new int[size];

                for(int i=0;i<size;i++){
                        arr[i]=sc.nextInt();
                }

                for(int i=0;i<size;i++){

			if(arr[i]<0){

				arr[i]*=arr[i];
				System.out.print( arr[i] +"\t");
			}
			else{

                        System.out.print(arr[i] +"\t");
			}

                }
        }
}
