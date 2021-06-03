package demo;

public class MergeSortedArraysNoExtraSpace {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]=new int [] {1,5,9,10,15,20};
    int b[]=new int [] {2,3,8,13};
    merge(a,a.length,b,b.length);
   
}
	
	public static void printarray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
	}
 
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
	/*	int p1=m-1;
        int p2=n-1;
        int k =m+n-1;
        while(p2>=0)
        {
            if(p1>=0 && nums1[p1]>nums2[p2])
                nums1[k--]=nums1[p1--];
            else
                nums1[k--]=nums2[p2--];
        }
        */
    	//System.out.println();
		
		
		int p1=m-1;
		int p2=n-1;
		
		for(int i=p2;i>=0;i--)
		{int j;
			int last=nums1[p1];
			 for(j=p1-1;j>=0 && nums1[j]>nums2[i];j-- )
			 { nums1[j+1]=nums1[j];
		     }
			 
			 // for the case when like second array first element is smallest,then even after iterating the whole first array no element 
			 //will be found ,therefore even if one shift has been done ,place the smallest element at correct position.
			 
			 //also for case when j has both has same length elements and all sorted but not last,then last element will not be taken into consideration
			 // nums1- [1,2,8] nums2[3,6]
			 
			 if(j!=m-2 || last>nums2[p2])
			 {
				 nums1[j+1]=nums2[i];
				 nums2[i]=last;
			 }
			
		}
		 System.out.println();
}
}
