/*Program by Mihir Gandhi B1 1611077 */

import java.util.*;

class Exp02
{
	 public static void main(String args[])
	 {
		 int n,m,i,j,p[][];
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the no. of players:");	
		 n=sc.nextInt();	// Accepting no. of players from user
		 p=new int[n][];	// Creating array having rows equal to number of players
		 float avg,sum;
		 for(i=0;i<n;i++)
		 {
			 System.out.print("Enter the no. of matches for Player "+(i+1)+": ");	
			 m=sc.nextInt();	// Accepting no. of matches played by player from user
			 p[i]=new int[m];	// Setting no. of columns for that row equal to no. of matches
			 for(j=0;j<m;j++)
			 {
				 System.out.print("Enter runs for Match "+(j+1)+": ");
				 p[i][j]=sc.nextInt();		// Accepting runs of matches played by player from user
			 }
		 }
		 for(i=0;i<n;i++)
		 {
			 sum=0;avg=0;
			 System.out.print("Runs scored by player "+(i+1)+": ");
			 for(j=0;j<p[i].length;j++)
			 {
				 System.out.print(p[i][j]+" ");
				 sum=sum+p[i][j];		// Calculating sum of runs of a player
			 }
			 System.out.print("\t"+"Sum: "+sum);
			 avg=sum/p[i].length;			// Calculating average of runs of a player
			 System.out.print("\t"+"Average: "+avg+"\n");
		 }
	 }
}

/*

***Output***
 
Enter the no. of players:
2
Enter the no. of matches for Player1:3
Enter runs for Match1:45
Enter runs for Match2:10
Enter runs for Match3:56
Enter the no. of matches for Player2:2
Enter runs for Match1:100
Enter runs for Match2:78
Runs scored by player 1: 45 10 56	Sum: 111	Average: 37  
Runs scored by player 1: 100 78		Sum: 178	Average: 89	   
*/