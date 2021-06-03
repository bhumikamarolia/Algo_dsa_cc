package demo;
/*lc:42
 * https://leetcode.com/problems/trapping-rain-water/submissions/
 */
public class TrappingRainWater {
	public static void main(String args[])
	{
		int arr[]=new int[] {4,2,0,3,2,5};
	
		int water=trap(arr);
		System.out.print(water);
	}
	 public static int trap(int[] height) {
	        int[] leftmax=new int[height.length];
	        int[] rightmax=new int[height.length];
	        leftmax[0]=height[0];
	        rightmax[height.length-1]=height[height.length-1];
	        int water=0;
	        for(int i=1;i<height.length;i++)
	        {
	            leftmax[i]=Math.max(leftmax[i-1],height[i]);
	        }
	        
	        for(int i=height.length-2;i>0;i--)
	        {
	            rightmax[i]=Math.max(rightmax[i+1],height[i]);
	        }
	            
	        for(int i=1;i<height.length;i++)
	        {
	            water+=Math.min(leftmax[i],rightmax[i])-height[i];
	        }
	            return water;
	    }
}
