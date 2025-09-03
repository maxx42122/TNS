package Statickeyword;



public class StaticBlock {
	
	private int section; 
	private static int srNo; 

	static{
		System.out.println("Block in java");
	}
	
	static void display()
	{
		System.out.println("Static Method");
		
		System.out.println("SrNo "+srNo);
		System.out.println();
	}
	
	void data()
	{
		System.out.println("Non-Static Method");
		System.out.println("Section "+ section);
		System.out.println("SrNo "+srNo);
	}
	
	public static void main(String[] args)
	{
		display();
		
	}
}