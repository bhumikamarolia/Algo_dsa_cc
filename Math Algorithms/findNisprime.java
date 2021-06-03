package demo;
/*
 * 
 * Given a number find if it's prime. the function isPrime() which 
 * takes an integer N as input parameters and returns an integer, 1 if N is a prime number or 0 otherwise.
 */
public class findNisprime {
	static int isPrime(int N){
        // code here
        if(N==0 || N==1)
        return 0;
        for(int i=2;i*i<=N;i++)
        {
            if(N%i==0)
              return 0;
        }
        return 1;
    }

}
