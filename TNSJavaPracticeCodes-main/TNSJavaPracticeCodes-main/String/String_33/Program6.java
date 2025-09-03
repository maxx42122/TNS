import java.util.*;
class StringDemo{
public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string1 :");
        String str1=sc.nextLine();
        System.out.println("Enter the string2 :");
        String str2=sc.nextLine();
        System.out.println(str1);
        System.out.println(str2);


        int str3=(str1.compareToIgnoreCase(str2));
//	if(str3==0||str3==32||str3==-32){

	//	System.out.println(str3);
	//}
	//else{
//		System.out.println(false);
//	}
	if(str3==0){
		System.out.println("true");
	}
	else{
		System.out.println("false");
	}

  
        }
}
