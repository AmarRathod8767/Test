package Test;

public class SI {
	float p,r,t,si;
	void accept(float p,float r,float t)	
	{
		System.out.println("FLOAT,FLOAT,FLOAT");
	this.p=p;
	this.r=r;
	this.t=t;
	
	}
	void accept(int p,int r,int t)
	{   
		System.out.println("INT,INT,INT");
		this.p=p;
		this.r=r;
		this.t=t;
	}
	
	void accept(float p,float r,int t)
	{   
		System.out.println("FLOAT,FLOAT,INT");
		this.p=p;
		this.r=r;
		this.t=t;
	}
	void accept(float p,int r,int t)
	{   
		System.out.println("FLOAT,INT,INT");
		this.p=p;
		this.r=r;
		this.t=t;
	}
	void accept(int p,float r,float t)
	{   
		System.out.println("INT,FLOAT,FLOAT");
		this.p=p;
		this.r=r;
		this.t=t;
	}
	void accept(int p,int r,float t)
	{   
		System.out.println("INT,INT,FLOAT");
		this.p=p;
		this.r=r;
		this.t=t;
	}
	void accept(int p,float r,int t)
	{   
		System.out.println("INT,FLOAT,INT");
		this.p=p;
		this.r=r;
		this.t=t;
	}
	void accept(float p,int r,float t)
	{   
		System.out.println("FLOAT,INT,FLOAT");
		this.p=p;
		this.r=r;
		this.t=t;
	}
	void si()
	{
		si=p*r*t/100;
	}
	void add()
	{
		si=(p+r+t);
	}
	void display()
	{
		System.out.println(si);
	}
}
