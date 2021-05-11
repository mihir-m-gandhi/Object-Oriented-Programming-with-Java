package myPack;

public class Trigo
{
	public static double sine(double x,int n)
	{
		double sum=0;
		int sign=1;
		int i=1;
		while(n!=0)
		{
			sum=sum+(sign)*(Math.pow(x,i))/(Trigo.fact(i));
			sign=sign*(-1);
			i=i+2;
			n=n-1;				
		}
		return sum;
	}
	public static double cos(double x,int n)
	{
		double sum=0;
		int sign=1;
		int i=0;
		while(n!=0)
		{
			sum=sum+(sign)*(Math.pow(x,i))/(Trigo.fact(i));
			sign=sign*(-1);
			i=i+2;
			n=n-1;				
		}
		return sum;
	}
	public static double cosec(double x,int n)
	{
		return 1/Trigo.sine(x,n);
	}
	public static double sec(double x,int n)
	{
		return 1/Trigo.cos(x,n);
	}
	public static double tan(double x,int n)
	{
		return Trigo.sine(x,n)/Trigo.cos(x,n);
	}
	public static double cot(double x,int n)
	{
		return Trigo.cos(x,n)/Trigo.sine(x,n);
	}		
	public static int fact(int z)
	{
		if(z!=0)
		{
			return z*fact(z-1);
		}
		else
		{
			return 1;
		}
	} 		
}



	