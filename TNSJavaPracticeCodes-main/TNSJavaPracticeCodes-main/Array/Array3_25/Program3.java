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
		int cnt=0;
		System.out.println("Enter specific number :");
		int num=sc.nextInt();

                for(int i=0;i<size;i++){

			if(num==arr[i]){

			cnt++;
			}
		}

                        
                        System.out.println("number " +num +" occured " +cnt +" times in an Array" );

                }
        
}
