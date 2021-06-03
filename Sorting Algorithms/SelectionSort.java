package demo;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]=new int [] {5,1,4,6,3,10,2,7,9,8};
    for(int i=0;i<a.length-1;i++)
    {   int maxi=i;
    	for(int j=i+1;j<a.length;j++)
    	{
    		if(a[maxi]>a[j])
    		maxi=j;
    	}
    			int temp=a[maxi];
    			a[maxi]=a[i];
    			a[i]=temp;
    		
    	
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
