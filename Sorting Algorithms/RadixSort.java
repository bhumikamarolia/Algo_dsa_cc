package demo;

import java.util.Arrays;

/*
 * Radix sort 
 * refer :https://www.cs.usfca.edu/~galles/visualization/RadixSort.html
 * 
 */
public class RadixSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]=new int[] {170, 45, 75, 90, 802, 24, 2, 66};
	    radixsort(nums);
		for(int i=0;i<nums.length;i++)
		{
			System.out.print(nums[i]);
		}
	}
	public static void radixsort(int[] nums) {
		 //finding the max no. for getting max.count in that ,this will also decide the end condition of while loop below
		int max=nums[0]; 
		for(int i=1;i<nums.length;i++)
		 { if(nums[i]>max)
			 max=nums[i];
		 }
		
	      int res[]=new int[nums.length]; //result array
	    
	      //Arrays.fill(count, 0);
	      int exp= 1; //10,100,1000... to scan the digits from lsb to msb
	      
      while(max / exp > 0)  //when this becomes 0,means we have move ahead of msb now
      {  int count[]=new int[10];   // notice count array is declared inside while loop to take new count array for each loop
	      for(int i=0;i<nums.length;i++)
	      {
	    	  
	    	  count[(nums[i] /exp) % 10]++;  //incrementing the count array
	      }
	       
	      for(int i=1;i<10;i++)
	      {  
	    	  count[i]+=count[i-1];   //cumulative frequency count array
	      }
	      
	      for(int i=nums.length-1;i>=0;i--)   //start looping from the end of array
	      {
	    	  res[count[(nums[i]/exp)%10]-1]=nums[i];   
	    	  count[(nums[i]/exp)%10]--;     //decrementing frequency in count array
	      }
	      
	      for(int i=0;i<nums.length;i++)
	      {
	    	   nums[i]=res[i];    //for the next pass resultant array will be input
	      }
	      exp*=10;
      }
	  }
	
}




