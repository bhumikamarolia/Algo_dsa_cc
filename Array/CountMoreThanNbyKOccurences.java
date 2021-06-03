package demo;

import java.util.HashMap;
import java.util.Map;

public class CountMoreThanNbyKOccurences {
	public static void main(String args[])
	{
		int arr[]=new int[] {2,3,3,2};
		int n=4;
		int k=3;
	   countOccurence(arr,n,k);
	}
	
	 public static int countOccurence(int[] arr, int n, int k) 
	    {
		 int count=0;
	        HashMap<Integer,Integer> h=new HashMap<>();
	        int x=n/k;
	        for(int i=0;i<n;i++)
	        {
	           if(!h.containsKey(arr[i]))
	             h.put(arr[i],1);
	             
	             else
	             h.put(arr[i],h.get(arr[i])+1);
	        }
	       
	        for(Map.Entry m: h.entrySet())
	        {
	            Integer temp=(Integer)m.getValue();
	            if(temp>x)
	            count++;
	        }
	        
	        return count;
	    }
}
