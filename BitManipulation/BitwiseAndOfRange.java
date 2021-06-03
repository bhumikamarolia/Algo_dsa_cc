package demo;
/*
 * Given two integers left and right that represent the range [left, right], return the bitwise AND of all numbers in this range, inclusive.
Example 1:

Input: left = 5, right = 7
Output: 4
 */
public class BitwiseAndOfRange {
	 public int rangeBitwiseAnd(int left, int right) {
	      
	        while(right>left)
	        {
	            right=right & (right-1);
	        }
	        return right;
	    }
}
