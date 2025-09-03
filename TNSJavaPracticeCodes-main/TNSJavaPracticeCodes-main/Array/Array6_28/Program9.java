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


			int cnt=0;
		

				for(int j=0;j<size;j++){



        			        int rem = 0;
		
			                int  rev= 0;
					int temp = arr[j];
		
                				while (temp > 0) {
							rem=temp%10;
							rev=rev*10+rem;
							temp/=10;
					}
				if((arr[j]==rev) || (temp>10)){
						cnt++;
			}
			
		}
		
        System.out.println("count of palindrome elements :" + cnt);
    }



}

