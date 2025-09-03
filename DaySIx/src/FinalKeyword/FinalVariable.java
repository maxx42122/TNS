package FinalKeyword;



public class FinalVariable {

	final int x =100;
	
	
	
		final static int Z =30;
		
	
	void change()
	{
		
	System.out.println(x);	
	}

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + "]";
	}

	public static void main(String[] args)
	{
		FinalVariable f = new FinalVariable();
		System.out.println(f);
		f.change();
	}
	
}