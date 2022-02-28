package Test;

public class PolyMorphismExample1 {
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	void add(int a,float b)
	{
		System.out.println(a+b);
		
	}
	void add(float a,float b)
	{
		System.out.println(a+b);
	}
	void add(float a, int b)
	{
		System.out.println(a+b);
	}

}
