/*Program by Mihir Gandhi B1 1611077*/

import java.util.*;

class Exp01   //main and methods are in same class, but methods are non-static
{
	int gcd(int a,int b)
	{
		if(a%b==0)
			return b;
		else
			return gcd(b,a%b);
		
	}
	int lcm(int a,int b)
	{
		return (a*b)/gcd(a,b);
	}	
	public static void main(String args[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		Exp01 ob=new Exp01();
		
		int g=ob.gcd(a,b);
		System.out.println("GCD is "+g);
		int l=ob.lcm(a,b);
		System.out.println("LCM is "+l);
		
	}	
}

/*

************OUTPUT***********
Enter the numbers:
5
4
GCD is 1
LCM is 20
*****************************

*/

/*class Exp01   //methods are in same class as main, but methods are static
{
	static int gcd(int a,int b)
	{
		if(a%b==0)
			return b;
		else
			return gcd(b,a%b);
		
	}
	static int lcm(int a,int b)
	{
		return (a*b)/gcd(a,b);
	}	
	public static void main(String args[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		
		int g=gcd(a,b);
		System.out.println("GCD is "+g);
		int l=lcm(a,b);
		System.out.println("LCM is "+l);
		
	}	
}*/

/*class Exp01   //methods are non-static but in different class than main
{
	
	public static void main(String args[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		Two ob=new Two();
		
		int g=ob.gcd(a,b);
		System.out.println("GCD is "+g);
		int l=ob.lcm(a,b);
		System.out.println("LCM is "+l);
	}	
}
  class Two
{
 	 int gcd(int a,int b)
	{
		if(a%b==0)
			return b;
		else
			return gcd(b,a%b);
		
	}
	int lcm(int a,int b)
	{
		return (a*b)/gcd(a,b);
	}	
}*/

/*class Exp01   //methods are static and in different class than main
{
	public static void main(String args[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		
		int g=Two.gcd(a,b);
		System.out.println("GCD is "+g);
		int l=Two.lcm(a,b);
		System.out.println("LCM is "+l);
	}	
}
  class Two
{
    static int gcd(int a,int b)
	{
		if(a%b==0)
			return b;
		else
			return gcd(b,a%b);
		
	}
	static int lcm(int a,int b)
	{
		return (a*b)/gcd(a,b);
	}	
}*/