package demo;
/*
 * divide and conquer algo
 */

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]=new int [] {5,1,4,6,3,10,2,7,9,8};
    int start=0;
    int end=a.length-1;
    mergesort(a, start, end);
    printarray(a);
	}
	
	public static void printarray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
	public static void mergesort(int [] a,int l,int r)
	{  if(l<r)
		{int mid=l+(r-l)/2;
		mergesort(a,l,mid);
		mergesort(a,mid+1,r);
		merge2sortedlists(a,l,mid,r);
		}
	}
	
	public static void merge2sortedlists(int [] a,int l,int mid,int r)
	{   
		int n1=mid-l+1;
        int n2=r-mid;
		int[] la=new int[n1];
		int ra[]=new int[n2];
       
        
		for(int i=0;i<n1;i++)
			la[i]=a[l+i];
		for(int j=0;j<n2;j++)
			ra[j]=a[mid+1+j];
		

		int i=0,j=0,k=l;
		while(i<n1 && j<n2)
		{
		   if(la[i]<=ra[j])
			   {a[k]=la[i];
			    i++;
			   }
		   else
			   {
			   a[k]=ra[j];
			   j++;
			   }
		   k++;
			
		}
			while(i<n1)
			{
				a[k]=la[i];
				i++;
				k++;
			}
			while(j<n2)
			{
				a[k]=ra[j];
				j++;
				k++;
			}
		
	}

}
