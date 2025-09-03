import java.util.*;
class ArrayDemo{
        public static void main(String[]args){
                Scanner sc=new Scanner(System.in);

                System.out.println("Enter size of Array :");
                int size=sc.nextInt();

                System.out.println("Enter Array elements :");
                int arr[]=new int[size];

                for(int i=0;i<size;i++){

                        arr[i]=sc.nextInt();
                }
                System.out.println("Prime number in the Array are :");


                for(int i=0;i<size;i++){

                        int num=arr[i];
                        int ele=arr[i];
                        int count=0;

                        while(num>0){
                                if(ele%num==0){
                                        count++;
                                }
                                num--;

                        }


                        if(count ==2){

                                        System.out.println(arr[i] +"\t");

                                }

                }
	}
}
