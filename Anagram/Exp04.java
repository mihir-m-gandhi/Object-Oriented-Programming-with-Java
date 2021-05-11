/*Program by Mihir Gandhi B1 1611077 */
 
import java.util.*;

class Exp04
{
	public static void main(String args[])
	{
		int flag=0;
		Scanner sc=new Scanner(System.in);
		String s1,s2;
		System.out.println("Enter first string:");
		s1=sc.next();
		System.out.println("Enter second string:");
		s2=sc.next();
		int l1,l2;
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		l1=s1.length();
		l2=s2.length();
		int f1=1,f2=1;
		char c1[]=new char[l1];
		char c2[]=new char[l2];
		if(l1==l2)
		{
			for(int i=0;i<l1;i++)
			{
				c1[i]=s1.charAt(i);
				c2[i]=s2.charAt(i);
			}
			
			for(int j=0;j<l1;j++)
			{
				flag=0;
				for(int k=0;k<l1;k++)
				{
					if(c1[j]==c2[k])
					{
						flag=1;break;
					}
				
				}
				
				if(flag==1)
				{
					f1=1;
				}
				else
				{
					f1=0;
					break;
				}
				
			}
			
			for(int j=0;j<l1;j++)
			{
				flag=0;
				for(int k=0;k<l1;k++)
				{
					if(c2[j]==c1[k])
					{
						flag=1;
						break;
					}
				
				}
				
				if(flag==1)
				{
					f2=1;
				}
				else
				{
					f2=0;
					break;
				}
				
			}
			
			if(f1==1 && f2==1)
			{
				System.out.println("Strings are Anagram");
			}
			else
			{
				System.out.println("Strings are not Anagram");
			}
			
		}
		else
		{
			System.out.println("Strings are not Anagram");	
		}
	}
}

/*

***Output***
Enter first string:
silent
Enter second string:
listen
Strings are Anagram

*/