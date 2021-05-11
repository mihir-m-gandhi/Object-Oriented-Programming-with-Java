/*Program by Mihir Gandhi B1 1611077 */

import java.io.*;
import java.util.*;

class Exp05 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int m;
		m=sc.nextInt();
		try
		{
			if(m>100||m<0)
			{
				throw new marks();    //creates object of marks()
			}
			else
			{
				System.out.println("Marks in bound");
			}	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}

class marks extends Exception
{
	public String toString()        //to give a message for the error found otherwise it will return class name as error
	{
		return ("java.lang.MarksOutOfRangeException");
	}
	
}

/*
OUTPUT
-20
java.lang.MarksOutOfRangeException
95
Marks in bound
110
java.lang.MarksOutOfRangeException
*/