package demo;
/*lc 135
 * https://leetcode.com/problems/candy/
 */
import java.util.HashSet;

public class ChocolateDistribution {
	public static void main(String args[])
	{
		int arr[]=new int[] {1,0,2};
	
		int no=distributeCandies(arr);
		System.out.print(no);
	}
public static int distributeCandies(int[] candyType) {
        int count=0;
        int arr[]=new int[candyType.length];
        
        for(int i=0;i<candyType.length;i++)
        {  arr[i]=1;
        } 
       
        for(int i=1;i<candyType.length;i++)
        {  if(candyType[i]>candyType[i-1])
        	arr[i]=arr[i-1]+1;
        }  
        for(int i=candyType.length-2;i>=0;i--)
        { if(candyType[i]>candyType[i+1] && arr[i]<=arr[i+1])
        	arr[i]=arr[i+1]+1;
        }
           
        for(int i:arr)
        {
          count+=i;
        }
        return count;
  }
}

