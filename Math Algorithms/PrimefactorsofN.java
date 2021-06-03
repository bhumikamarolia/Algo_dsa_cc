/*Find all prime factors of a given no. n
 * */
package demo;

import java.util.Scanner;

public class PrimefactorsofN {
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		primefactors(n);
		
	}
	public static void primefactors(int n)
	{
		// divide by 2 to get all 2 factors
		while(n%2==0)
			{n=n/2;
			System.out.print("2");
			}
		//no. will be odd now
		for(int i=3;i<=Math.sqrt(n);i+=2)
		{   while(n%i==0)
			{ n/=i;
			  System.out.print(i);
			}
		}
		
		//if no. is there it would now be greater than 2,3
		if(n>2)
		{
			System.out.print(n);
		}
	}

}
