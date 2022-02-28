package Test;

public class PolyMorphismExmple2 {
	int add(int a, int b, int c)
	{
		int d=a+b+c;
		
		return d;
	}
	float add(float a, float b, float c)
	{
		float d=a+b+c;
		return d;
	}
	float add(int a, float b,int c)
	{
		float d=a+b+c;
		return d;
	}
	float add(int a, int b, float c)
	{
		float d=a+b+c;
		return d;
	}
	float add(float a, int b, int c)
	{
		float d=a+b+c;
		return d;
	}
	float add(float a,int b,float c)
	{
		float d=a+b+c;
		return d;
	}
	void add(int a[],int b[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
	int add(Integer a, Integer b)
	{
		return a+b;
	}
	

}
