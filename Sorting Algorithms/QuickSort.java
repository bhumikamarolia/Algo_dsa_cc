package demo;

public class QuickSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]=new int [] {5,1,4,6,3,10,2,7,9,8};
    int start=0;
    int end=a.length-1;
    quicksort(a,start,end);
    printarray(a);
	}
	
	public static void printarray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
	public static void quicksort(int []a,int start,int end)
	{  if(end>start)
	 {
		int index=partition(a,start,end);
		quicksort(a,start,index-1);
		quicksort(a,index,end);
	 }
	}
	public static int partition(int[] a,int start,int end)
	{   int pivot=a[end];
	    int i=start-1;
		for(int j=start;j<end;j++)
		{
			if(a[j]<pivot)
			{
				i++;
				swap(a,i,j);
			}
		}
		swap(a,i+1,end);
		return i+1;	
	}
	public static void swap(int[] a,int i,int j)
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}
