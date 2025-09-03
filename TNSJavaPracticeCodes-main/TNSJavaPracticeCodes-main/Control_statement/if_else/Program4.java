class Uppercase{
	public static void main(String[]args){
		char ch = 'B';
		if(ch>97 && ch<122){
			System.out.println(ch+"=it is lowercase alphabet");
		}
		else if(ch>65 && ch<90){
                        System.out.println(ch+"=it is uppercase alphabet");
                }
		else {
			System.out.println("ivalid input");
		}
	}
}
