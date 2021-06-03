package demo;
/*
 * lc-204
 * 204. Count Primes
 */
public class Primeno1ton {
	 public int countPrimes(int n) {
	      boolean isprime[]=new boolean[n];
	      int count=0;
	        for(int i=2;i*i<n;i++)
	        {
	           if(isprime[i]==false)
	            {  
	                for(int j=2;i*j<n;j++)
	                   isprime[i*j]=true;
	            }      
	        }
	        
	       
	        for (int i = 2; i < n; i++) {
	            if (!isprime[i]) {
	                count++;
	                System.out.print(i);
	            }
	        }
	    return count;
	    }
}
