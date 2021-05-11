/* Program by Mihir Gandhi B1 1611077 */ 

import myPack.*;
import java.util.*;

public class Exp09
{
	public static void main(String[] args)
	{
		int n,ch;
		double x,result;
		Scanner sc=new Scanner(System.in);
		do
		{
		System.out.println("\nChoose the series...");
		System.out.println("1.Sin \n2.Cos \n3.Cosec \n4.Sec \n5.Tan \n6.Cot \n7.Exit"); 
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
			{
				System.out.println("Enter the value of x and no. of terms: ");
				x=sc.nextDouble();
				n=sc.nextInt();
				x=3.14*x/180;
				result=Trigo.sine(x,n);
				System.out.println("The value is "+result);
				break;	
			}
			case 2:
			{
				System.out.println("Enter the value of x and no. of terms: ");
				x=sc.nextDouble();
				n=sc.nextInt();
				x=3.14*x/180;
				result=Trigo.cos(x,n);
				System.out.println("The value is "+result);
				break;		
			}
			case 3:
			{
				System.out.println("Enter the value of x and no. of terms: ");
				x=sc.nextDouble();
				n=sc.nextInt();
				x=3.14*x/180;
				result=Trigo.cosec(x,n);
				System.out.println("The value is "+result);
				break;		
			}			
			case 4:
			{
				System.out.println("Enter the value of x and no. of terms: ");
				x=sc.nextDouble();
				n=sc.nextInt();
				x=3.14*x/180;
				result=Trigo.cos(x,n);
				System.out.println("The value is "+result);
				break;		
			}
			case 5:
			{
				System.out.println("Enter the value of x and no. of terms: ");
				x=sc.nextDouble();
				n=sc.nextInt();
				x=3.14*x/180;
				result=Trigo.tan(x,n);
				System.out.println("The value is "+result);
				break;		
			}
			case 6:
			{
				System.out.println("Enter the value of x and no. of terms: ");
				x=sc.nextDouble();
				n=sc.nextInt();
				x=3.14*x/180;
				result=Trigo.cot(x,n);
				System.out.println("The value is "+result);
				break;		
			}
		}
		}while(ch!=7);
		System.out.println("\n\nProgram by Mihir Gandhi B1 1611077");
	}
}