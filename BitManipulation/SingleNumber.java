package demo;
/*
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.
Example 1:

Input: nums = [2,2,1]
Output: 1
 */
import java.io.*;
import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {
        
       int a=nums[0];
        for(int i=1;i<nums.length;i++)
        { a^=nums[i]; //as a^b==b^a and a^a=0 so xoring all will give the leftout no.
        }
        return a;
    }
}