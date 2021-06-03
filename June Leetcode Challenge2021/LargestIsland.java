package demo;

public class LargestIsland {
	public static void main(String args[])
	  {
		  int input[][]=new int[][] {{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};
		 int res= maxAreaOfIsland(input);
		 System.out.print(res);
	  }
	    static int count=0;
	    public static int maxAreaOfIsland(int[][] grid) {
	        
	        int row=grid.length;
	        int col=grid[0].length;
	        boolean visited[][]=new boolean[row][col];
	        int result=0;
	       
	        for(int i=0;i<col;i++)
	        { for(int j=0;j<row;j++)
	            {  if(grid[i][j]==1 && !visited[i][j])
	                {count=1;
	                 dfs(i,j,grid,visited);
	                 result=Math.max(result,count);
	                }
	                   
	            }
	        }
	        return result;
	    }
	    public static void dfs(int i,int j,int[][] grid,boolean[][] visited) 
	    {
	        int row[]={1,0,-1,0};
	        int col[]={0,1,0,-1};
	          
	        visited[i][j]=true;
	        for(int k=0;k<4;k++)
	        {
	            if(issafe((i+row[k]),(j+col[k]),grid,visited))
	            {
	                count++;
	                dfs(i+row[k],j+col[k],grid,visited);
	            }
	        }
	    }
	    
	    public  static boolean issafe(int i,int j,int[][] grid,boolean[][] visited)
	    {
	   return ((i<grid.length) && (j<grid[0].length) && (i>=0) && (j>=0) && (grid[i][j]==1) && (!visited[i][j]));
	    }
	
}
