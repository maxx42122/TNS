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
		System.out.println("Specific number :");
		int num=sc.nextInt();

		int position=0;
		int cnt=0;

                for(int i=0;i<size;i++){

			if(num==arr[i]){
				cnt++;
				position=i;
				break;
			}
		}
		if(cnt!=0){


                       
                        System.out.println(num +" is found in Array at" +position);
			
			}else{
			

				System.out.println(num +" is not found in Array" );
			
			}
	}
		
	
		                
        
}
