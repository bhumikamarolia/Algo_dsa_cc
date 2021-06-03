package demo;

public class findCatalnNo {
	 int catalan(int n)
	    {
	        int res = 0;
	 
	        // Base case
	        if (n <= 1)
	        {
	            return 1;
	        }
	        for (int i = 0; i < n; i++)
	        {
	            res += catalan(i)
	                * catalan(n - i - 1);
	        }
	        return res;
	    }
	 
	 public static long gcd(long a,long b) //assuming a is smaller ,b is larger
	  {
		  if(a==0)
			  return b;
		  
		  return gcd(b%a,a);   //next iteration b%a will be smaller no.
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
	 
	    // Driver Code
	    public static void main(String[] args)
	    {   //normal method to find nth catalan no.
	    	/*findCatalnNo cn = new findCatalnNo();
	        for (int i = 0; i < 10; i++)
	        {
	            System.out.print(cn.catalan(i) + " ");
	        }*/
	        
	        int n=3;//which catalan no. to be finded
	        //finding catalan no. using binomial coefficient
	        //Cn=2nCn/n+1;
	        long c=findbincoeff(2*n,n);
	        long no=c/(n+1);
	        System.out.print(no);   //counting starts from 0
	        
	    }
}
