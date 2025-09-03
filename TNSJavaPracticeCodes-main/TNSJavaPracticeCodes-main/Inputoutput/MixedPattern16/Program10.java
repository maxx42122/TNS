import java.io.*;
class Pattern{

	public static void main(String[]args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no. of num :");
		long num=Long.parseLong(br.readLine());

		int i=1;
		int num2=0;

		 while (num>0) {
                         long digit=num%10l;
                        // System.out.print(digit+" ");

                        num /= 10;


			if(digit%2==1){
				System.out.print(digit*digit +"  ");
			}

                                i++;
		 }

                      
		      
		
	}
}

