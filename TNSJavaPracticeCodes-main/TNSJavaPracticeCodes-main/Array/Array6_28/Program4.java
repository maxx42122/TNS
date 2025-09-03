import java.util.*;
class ArrayDemo{
        public static void main(String[]args){
                Scanner sc =new Scanner(System.in);
                System.out.print("Enter the Size of array :");
                int size=sc.nextInt();

                System.out.println("Enter element Array1 :");
                int arr1[]=new int[size];

                for(int i=0;i<size;i++){

                        arr1[i]=sc.nextInt();
                }

		System.out.println("Enter elements in Array2 :");

		 int arr2[]=new int[size];                                                                                                                                                                  for(int j=0;j<size;j++){
                                                                                                                      arr2[j]=sc.nextInt();
                }

		System.out.println(" common elements in the given array :");

              

                for(int i=0;i<size;i++){

			for(int j=0;j<size;j++){
				
				if(arr1[i]==arr2[j]){

					System.out.print(arr1[i] +"\t");
				}
			}

		}
	}
}	
                
                                             
