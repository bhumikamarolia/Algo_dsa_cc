package demo;
/*
 * Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the single element and return it.

You must implement a solution with a linear runtime complexity and use only constant extra space.
Example 1:

Input: nums = [2,2,3,2]
Output: 3
Example 2:

Input: nums = [0,1,0,1,0,1,99]
Output: 99
 */
public class SingleNumberII {
	
	    public int singleNumber(int[] nums) {
	        int ones=0;
	        int twos=0;
	        
	        for(int i=0;i<nums.length;i++)
	        {
	            ones=(ones^nums[i]) & (~twos);
	            twos=(twos^nums[i]) & (~ones);
	            
	        }
	        System.out.print(ones);
	        return ones;
	    }

}
