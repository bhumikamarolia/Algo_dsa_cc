package demo;
/*lc:53
 * https://leetcode.com/problems/maximum-subarray/
 */
public class LargestSumContagiousSubarray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]=new int [] {-2,1,-3,4,-1,2,1,-5,4};
    int pi=maxSubArray(a);
    System.out.print(pi);
 
	}
	public static int maxSubArray(int[] nums) {
        int sum=nums[0];
        int maxsum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            sum=Math.max(nums[i],sum+nums[i]);
            maxsum=Math.max(maxsum,sum);
           
        }
        return maxsum;
    }
}
