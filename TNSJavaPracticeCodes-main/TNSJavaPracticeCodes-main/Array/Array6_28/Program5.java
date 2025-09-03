import java.util.*;
class ArrayDemo{
        public static void main(String[]args){
                Scanner sc =new Scanner(System.in);
                System.out.print("Enter the Size of array1 :");
                int size1=sc.nextInt();

                System.out.println("Enter element Array1 :");
                int arr1[]=new int[size1];

                for(int i=0;i<size1;i++){

                        arr1[i]=sc.nextInt();
                
		}
		 System.out.print("Enter the Size of array2 :");                                                int size2=sc.nextInt();

                System.out.println("Enter elements in Array2 :");

                 int arr2[]=new int[size2];                                                    
                for(int j=0;j<size2;j++){

                        arr2[j]=sc.nextInt();
                }

              
                
			for(int i=0;i<size1;i++){

			System.out.print(arr1[i] +"\t");
			}
			for(int j=0;j<size2;j++){
				System.out.print(arr2[j] +"\t");
		}
	}
}

                        

                        

                                      
