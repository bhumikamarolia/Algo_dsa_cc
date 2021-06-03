package demo;
/*used when input is uniformally distributed
 * https://www.cs.usfca.edu/~galles/visualization/BucketSort.html
 * */

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BucketSort {
	public static void main(String args[])
	{
	 float nums[]={ (float) 0.42, (float) 0.32, (float) 0.33, (float) 0.52, (float) 0.37, (float) 0.47,
		        (float) 0.51 };
	    int n=nums.length;
	   sort(nums);		
		for(int i=0;i<n;i++)
		{
			System.out.print(nums[i]);
		}
	}
	public static void sort(float[] nums)
	{
	  int n=nums.length;
           
      ArrayList<Float>[] bucket = new ArrayList[n];

            // Create empty buckets
            for (int i = 0; i < n; i++)
              bucket[i] = new ArrayList<Float>();
            
            for(int i=0;i<n;i++)
            {
               
            	int bucketindex=(int)nums[i]*n; //assuming 10 buckets in it.then forlike1.23=1.23*10 that is second bucket
            	bucket[bucketindex].add(nums[i]);
            }
         
            //sort the element of each bucket
            for(int i=0;i<n;i++)
            {
            	Collections.sort(bucket[i]);
            }
            
            //get the sorted array
            int index=0;
            for(int i=0;i<n;i++)
            {
            	for(int j=0,size=bucket[i].size();j<size;j++)
            	{
            		nums[index++]=bucket[i].get(j);
            	}
            }
	}
}

