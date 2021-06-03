package demo;
/*
 * Find the number of valid parentheses expressions of given length.
 * Application of Catalan Numbers. Total possible valid expressions for input n is n/2’th Catalan Number if n is even and 0 if n is odd. 
 * refer https://www.geeksforgeeks.org/applications-of-catalan-numbers/
 */
public class validbracketsCatalan {
	public static void main(String[] args)
    {
        int n = 6;
        long ans=findans(n);
        System.out.print(ans);
    }
	
	public static long findans(int n)
	{  //if n is odd then no valid expression can be formed
		if((n&1)!=0)
			return 0;
		else
			return cataln(n/2);
	}
	public static long cataln(int n)
	{   
		  long c=findbincoeff(2*n,n);
		  long no=c/(n+1);
		  return no;
	}
	 static long findbincoeff(int n,int r)
	 {
		 long p=1; //num
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
