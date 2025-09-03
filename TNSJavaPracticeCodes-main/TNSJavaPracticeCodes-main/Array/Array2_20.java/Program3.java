import java.util.*;
class ArrayDemo{
        public static void main(String[]args){

                Scanner sc=new Scanner (System.in);
                System.out.println("Enter the size of Array :");
                int size=sc.nextInt();

                System.out.println("Enter Array elements :");
                char arr[]=new char[size];

        for(int i=0;i<size;i++){

                arr[i]=sc.next().charAt(00);
        }

        

        for(int i=0;i<size;i++){

                if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'){

                System.out.println("vowel "+arr[i] +" found at" +i);
                }


        }
       
        }
}
