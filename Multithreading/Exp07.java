/* Program by Mihir Gandhi B1 1611077 */

import java.util.*;		//For using in-built Thread class and Random class

class Exp07
{
	public static void main(String[] args)
	{
		for(int k=0;k<10;k++)		//For loop of 10 iterations for demonstrating multithreading
		{
			Random rand =new Random();		//Creating an object of Random class
			int num=rand.nextInt(10);		//Assigning num a random value between 0 and 10, 10 exclusive
			Thread ob1=new Even(num);		//Creating an object of Even class	
			Thread ob2=new Odd(num);		//Creating an object of Odd class
			if(num%2==0)		//Checking if the number is even
			{
				ob1.start();	//Moving control to run method of even class	
			}
			else
			{
				ob2.start();	//Moving control to run method of odd class	
			}
			try					//Start of try and catch block
			{
				Thread.sleep(100);		//Causing the currently executed thread to sleep for 1 second
			}
			catch(Exception e)
		        {
      	     		 System.out.println(e);	
      	    	        }					//End of try and catch block
		}
	}
}

class Odd extends Thread
{
	int x;
	Odd(int y)
	{
		x=y;
	}
	public void run()
	{
		int answer=x*x*x;		//Calculating cube
		System.out.println(" ODD. Cube is "+ answer);
	}
}

class Even extends Thread
{
	int x;
	Even(int y)
	{
		x=y;
	}
	public void run()
	{
		int answer=x*x;			//Calculaing square
		System.out.println("EVEN. Square is "+ answer);
	}
  
}

/* 
 OUTPUT
 
 EVEN. Square is 16
 EVEN. Square is 36
  ODD. Cube is 729
 EVEN. Square is 16
 EVEN. Square is 64
  ODD. Cube is 27
  ODD. Cube is 125
 EVEN. Square is 0
 EVEN. Square is 64
  ODD. Cube is 1
  
 */