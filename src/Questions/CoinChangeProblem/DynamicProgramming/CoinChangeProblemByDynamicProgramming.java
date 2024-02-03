package Questions.CoinChangeProblem.DynamicProgramming;

import java.util.Arrays;

//Asked in flipkart and paytm 
//find min no of coins to get 11 rps in {9,6,5,1} coins

public class CoinChangeProblemByDynamicProgramming {
	
	static int count=0;
	static int countDP=0;
	
	public static void main(String[] args) {
		
		int n=11;
		int coins[]= {9,6,5,1};
		int dp[]=new int[n+1];
		
		for(int i=0;i<dp.length;i++)
		{
			dp[i]=-1;
		}
		
		Arrays.fill(dp, -1);
		dp[0]=0;
		
		int ans1=minCoins(n,coins,dp);
		int ans=minCoins(n,coins);
		
		System.out.println("===========Without Using Dynamic Programing=============");
		System.out.println("Rs "+n+" : "+ans);
		System.out.println("Count : "+count);
		
		System.out.println("==============Using Dynamic Programming================");
		System.out.println("Rs "+n+" : "+ans1);
		System.out.println("CountDP : "+countDP);
		
		System.out.println(Arrays.toString(dp));
	}

	//Dynamic Programming
	private static int minCoins(int n, int[] coins, int[] dp) {

		countDP++;
		
		if(n==0)
			return 0;
		
		int ans=Integer.MAX_VALUE;
		
		for(int i=0;i<coins.length;i++)
		{
			if(n-coins[i]>=0)
			{
				int subAns=0;
				
				if(dp[n-coins[i]]!=-1)
					subAns=dp[n-coins[i]];
				else
					subAns=minCoins(n-coins[i], coins, dp);
				
				if(subAns!=Integer.MAX_VALUE && subAns+1<ans)
					{
					ans=subAns+1;
					}
			}
		}
		
		return dp[n]=ans;
	}

	private static int minCoins(int n, int[] coins) {
		
		count++;
		
		if(n==0)
			return 0;
		
		int ans=Integer.MAX_VALUE;
		
		for(int i=0;i<coins.length;i++)
		{
			if(n-coins[i]>=0)
			{
				int subAns=0;
				subAns=minCoins(n-coins[i], coins);
				if(subAns!=Integer.MAX_VALUE && subAns+1<ans)
				{
					ans=subAns+1;
				}
			}
		}
		return ans;
	}

}
