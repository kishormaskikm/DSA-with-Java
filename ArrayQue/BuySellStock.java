package ArrayQue;

public class BuySellStock {
    public static void main(String[] args) {
        int prises[] ={5,2,6,1,4};
        int ans = ChechmaxProfit(prises);
        System.out.println(ans);

    }

//    for single stock (you can buy and sell stock only one time)
    static int ChechmaxProfit(int[] prices) {
        int maxProfit = 0;
        int minSoFar = prices[0];


        for(int i=0; i<prices.length; i++){
            minSoFar = Math.min(minSoFar,prices[i]);
            int profit = prices[i]-minSoFar;
            maxProfit = Math.max(maxProfit,profit);
        }
        return maxProfit;
    }

//    you can buy and sell stock multiple time but condition is after every buy you must sell the stock

    public int maxProfit(int[] prices) {
        int profit =0;
        for(int i=1; i<prices.length; i++){
            if(prices[i]>prices[i-1]){
                profit += prices[i]-prices[i-1];
            }
        }
        return profit;
    }
}
