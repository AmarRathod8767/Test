package Test;

public class Staff {
	public int rNo;
	private int mNum;
	protected int fees;
	String sName;
	public static void main(String[]args)
	{
		Staff obj=new Staff();
		obj.fees=25000;
		obj.mNum=975424;
		obj.sName="Amar Rathod";
		
		System.out.println("Name: "+obj.sName+" Mobile Number: "+obj.mNum+" Fees: "+obj.fees);
	}

}
