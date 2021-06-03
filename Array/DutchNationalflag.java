package demo;
/*lc:75
 * https://leetcode.com/problems/sort-colors/
 */
public class DutchNationalflag {
	 public void sortColors(int[] nums) {
	       int zeroindex=0;
	       int i=0;
	       int endindex=nums.length-1;
	       while(i<=endindex)
	       {
	           if(nums[i]==0)
	               swap(nums,zeroindex++,i++);
	           else if(nums[i]==2)
	               swap(nums,endindex--,i);
	           else
	               i++;
	       }
	    }
	    
	    public static void swap (int nums[],int i,int j)
	    {
	        int temp=nums[i];
	        nums[i]=nums[j];
	        nums[j]=temp;
	    }

}
