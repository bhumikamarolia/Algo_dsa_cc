package demo;
/*lc:215
 * https://leetcode.com/problems/kth-largest-element-in-an-array/
 */
import java.util.Random;

public class Klargestelement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]=new int [] {3,2,1,5,6,4};
    int k=2;
    int pi=findKthLargest(a,2);
    System.out.print(pi);
 
	}
	public static int findKthLargest(int[] nums, int k) {
	       int n=nums.length;
        int low=0;
        int high=n-1;
    //  shuffle(nums);//shuffling the input array elements to improve TC
    while(low<=high)
    {int pi=findkno(nums,low,high);
	        if(pi==n-k)
	            return nums[pi];
	        if(n-k<pi)
	          high=pi-1;
	        else
	          low=pi+1;
    }    
	        return nums[low];
	       
	    }
	    
	    public static int findkno(int nums[],int low,int high)
	    {    Random rand = new Random();
          int pivotIdx = low + rand.nextInt(high - low+1);
          swap(nums, high, pivotIdx); //shuffling pivot to improve tc
	        int pivot=nums[high];
	        int i=low-1;
	        for(int j=low;j<nums.length;j++)
	        {
	            if(nums[j]<pivot){
	                i++;
	                swap(nums,i,j);
	            }
	        }
	        swap(nums,i+1,high);
	        return i+1;
	    }
	    
	    public static void swap(int[] nums,int i,int j)
	    {
	        int temp=nums[i];
	        nums[i]=nums[j];
	        nums[j]=temp;
	    }
     
 public static void shuffle(int[] a)
 {
     final Random random=new Random();
     for(int i=0;i<a.length;i++)
     {
         final int r=random.nextInt(i+1);
         swap(a,i,r);
     }
 }
       
}
