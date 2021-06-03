package demo;
/*lc 121
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */
public class BestTimeToBuyAndSellStock {
	
	    public int maxProfit(int[] prices) {
	       int diff=0;
	        int maxprofit=0;
	        int minvalue=prices[0];
	        for(int i=0;i<prices.length;i++)
	        {
	            if(prices[i] < minvalue)
	                minvalue=prices[i];
	            else if(prices[i]-minvalue>maxprofit)
	                maxprofit=prices[i]-minvalue;
	        }
	        return maxprofit;
	    }
	
}
