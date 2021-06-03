package demo;

public class InsertionSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]=new int [] {5,1,4,6,3,10,2,7,9,8};
   
    insertionsort(a,a.length);
    printarray(a);
	}
	
	public static void printarray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
	public static void insertionsort(int[] a,int n)
	{
		for(int i=1;i<n;++i)
		{
			int key=a[i];
			int j=i-1;
			
			while(j >= 0 && a[j] > key)
			{
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=key;
		}
      
	}
}
