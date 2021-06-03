package demo;
/*
 * Merge Intervals
 * lc-56
 * https://leetcode.com/problems/merge-intervals/
 */
import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class MergeIntervals {
  public static void main(String args[])
  {
	  int input[][]=new int[][] {{6,8},{1,9},{2,4},{4,7}};
	 int [][] res= mergeint(input);
  }
  public static int[][] mergeint(int[][] intervals)
  {
	 
	
	  java.util.Arrays.sort(intervals, new java.util.Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1[0], o2[0]) ;
			}
		});
	  //in java 8 can use lamda function for comparingS
	//  Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
	  LinkedList<int[]> merged=new LinkedList<>();
	  for(int[] interval:intervals)
	  {
		  if(merged.isEmpty() || merged.getLast()[1]<interval[0])
			  merged.add(interval);
		  else
			  merged.getLast()[1]=Math.max(merged.getLast()[1],interval[1]);
	  }
	  
	  return merged.toArray(new  int [merged.size()][]);
	  
	  //another approach using array
	/*  
	  int count = 0;
      for(int i=0;i<arr.length-1;i++)
      {
          int curr[] = arr[i];
          
          for(int j=i+1;j<arr.length;j++)
          {
              int next[] = arr[j];
              
              if(overlap(curr,next))
              {
                  next[0] = Math.min(curr[0],next[0]);
                  next[1] = Math.max(curr[1],next[1]);
                  
                  curr[0] = 0;
                  curr[1] = -1;
                  count++;
                  break;
              }
          }
      }
      
      int[][] res = new int[arr.length-count][2];
      int g = 0;
      for(int i=0;i<arr.length;i++)
      {
          if(arr[i][0]<=arr[i][1])
          {
              res[g][0] = arr[i][0];
              res[g][1] = arr[i][1];
              g++;
          }
      }
      
      return res;*/
	
    
}
  /*public static boolean overlap(int a[], int b[])
  {
     return a[0]<=b[1] && a[1]>=b[0];
  }*/
}
