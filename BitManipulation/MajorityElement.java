package demo;
/*
 * Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */
public class MajorityElement {
	public int majorityElement(int[] nums) {
        //bit manipulation
       /* String pos="0";
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] & (1<<pos))
            {
                count++;
            }
            pos++;
        }
        if(count>(nums.length/2))
            return count;*/
        //moore voting algo
        int majority=0;
        int count=0;
        for(int i:nums)
        {
            if(count==0)
              majority=i;
            if(i==majority)
                count++;
            else
                count--;
        }
        
        return majority;
    }
}
