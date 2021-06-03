package demo;

//Radix sort Java implementation
import java.io.*;
import java.util.*;

class CountingSort
{
	public static void main(String args[]) throws IOException
	{
	    int nums[]=new int[] { 1, 4, 1, 2, 7, 5, 2};
	    int n=nums.length;
		countingsort(nums,n);		
		for(int i=0;i<n;i++)
		{
			System.out.print(nums[i]);
		}
	}
	public static void countingsort(int[] nums,int n)
	{
		int[] count=new int[256];
		int[] ans=new int[n];
		for(int i=0;i<n;i++)
		{
			count[nums[i]]++;
		}
		
		for(int i=1;i<256;i++)
		{
			count[i]+=count[i-1];
		}
		for(int i=n-1;i>=0;i--)
		{
			ans[count[nums[i]]-1]=nums[i];
			count[nums[i]]--;
		}
		for(int i=0;i<n;i++)
		{
			nums[i]=ans[i];
		}
	}
}

	
