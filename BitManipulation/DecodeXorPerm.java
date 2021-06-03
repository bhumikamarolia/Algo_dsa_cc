package demo;
/*
 * There is an integer array perm that is a permutation of the first n positive integers, where n is always odd.
It was encoded into another integer array encoded of length n - 1, such that encoded[i] = perm[i] XOR perm[i + 1]. For example, if perm = [1,3,2], then encoded = [2,1].
Given the encoded array, return the original array perm. It is guaranteed that the answer exists and is unique.

Example 1:
Input: encoded = [3,1]
Output: [1,2,3]
Explanation: If perm = [1,2,3], then encoded = [1 XOR 2,2 XOR 3] = [3,1]
Example 2:

Input: encoded = [6,5,4,6]
Output: [2,4,1,5,3]
 */
public class DecodeXorPerm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int A[]=new int[] {3,1};
      int r[]=decode(A);
      for(int i=0;i<r.length;i++)
      {
    	  System.out.print(r[i]);
      }
	}
    
	public static int[] decode(int[] encoded)
    {
		int n=encoded.length+1;
        int first=0;
        
       /* for(int i=1;i<=n;i++){
            if(n%4==0)
                first=0;
            else if(n%4==1)
                first =1;
            else if(n%4==2)
                first =n+1;
            else 
                first= 0;
            
        }*/
        for(int i=1;i<=n;i++){
            first ^= i; 
        }
        //System.out.print(first);
        for(int i=1;i<n;i+=2)
        {
            first^=encoded[i];
        }
        
        int perm[]=new int[n];
        perm[0]=first;
        for(int i=0;i<n-1;i++)
        {
            perm[i+1]=perm[i]^encoded[i];
        }
        return perm;
        
   }
}
