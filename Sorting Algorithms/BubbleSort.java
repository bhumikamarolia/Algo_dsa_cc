package demo;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]=new int [] {5,1,4,6,3,10,2,7,9,8};
    for(int i=0;i<a.length;i++)
    {
    	for(int j=0;j<a.length-1;j++)
    	{
    		if(a[j]>a[j+1])
    		{
    			int temp=a[j];
    			a[j]=a[j+1];
    			a[j+1]=temp;
    		}
    	}
    }
    printarray(a);
	}
	
	public static void printarray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
}
