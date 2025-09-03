import java.util.*;
class StringDemo{
public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string1 :");
        String str1=sc.nextLine();
        


       if(str1.isEmpty()){


                System.out.println(" given String is empty ");

       }
       else{
                System.out.println(str1.substring(str1.length()-1));
        }


        }
}
