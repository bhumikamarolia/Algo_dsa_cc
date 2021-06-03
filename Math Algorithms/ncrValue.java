package demo;

import java.util.Scanner;

/*
 * Calculate NCR value for given N and R
 */
public class ncrValue {
  
  public static void main(String args[])
  {
		  Scanner s=new Scanner(System.in);
		  int n=s.nextInt();
		  int r=s.nextInt();
		  long ans=findncr(n,r);
		  System.out.print(ans);
  }
  
  public static long findncr(int n,int r)
  {   long p=1; //num
      long d=1; //denominator
	  if(n-r<r)
		  r=n-r;
	  if(r==0)
		  return 1;
	  else
	  {
		
		  long gcdval=0;
		 if(r!=0)
		 {
		  while(r>=1)
		  {
			  p*=n;
			  d*=r;
			  gcdval=gcd(p,d);
			  p/=gcdval;
			  d/=gcdval;
			  n--;
			  r--;
		  }
		 }
		 else
			 p=1;
		 
	  }
	  return p;
  }
  
  public static long gcd(long a,long b) //assuming a is smaller ,b is larger
  {
	  if(a==0)
		  return b;
	  
	  return gcd(b%a,a);   //next iteration b%a will be smaller no.
  }
}
