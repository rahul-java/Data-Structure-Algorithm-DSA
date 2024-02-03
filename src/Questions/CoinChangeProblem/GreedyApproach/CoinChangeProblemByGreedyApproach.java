package Questions.CoinChangeProblem.GreedyApproach;

import java.util.ArrayList;
import java.util.List;

public class CoinChangeProblemByGreedyApproach {

	public static void main(String[] args) {
		
		int[] coins= {1,2,5,10,20,50,100,500,1000};
		int reqCurrency=93;
		
		System.out.println("Currency :"+reqCurrency);
		calculateMinCoins(coins,reqCurrency);
	}

	private static void calculateMinCoins(int[] coins, int reqCurrency) {

		List<Integer> list = new ArrayList<>();
		
		for(int i=coins.length-1;i>=0;i--)
		{
			while(reqCurrency>=coins[i])
			{
				list.add(coins[i]);
				reqCurrency-=coins[i];
			}
		}
		
		System.out.println("No. of Coins required : "+list.size());
		System.out.println("Denomination of Coins : "+list);
		
		
	}
}
