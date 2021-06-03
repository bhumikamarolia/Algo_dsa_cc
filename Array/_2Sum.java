package demo;
/*
 * https://leetcode.com/problems/two-sum/solution/
 */
import java.util.HashMap;

public class _2Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int arr1[]=new int[] {2,7,11,15};
		  int target=9;
	
			int[] no=twoSum(arr1,target);
			for(int i=0;i<no.length;i++)
			{
				System.out.print(no[i]);
			}
			
	}
	 public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer,Integer> h=new HashMap<>();
		for(int i=0;i<nums.length;i++)
		{
			int complement=target-nums[i];
			if(h.containsKey(complement))
				return new int[] {h.get(complement),i};
			h.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	    }
}
