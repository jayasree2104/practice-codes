public class Buyorsell {
    //brute force is 2 for loops, o(n^2) and o(1)
    //optimal is o(n) and o(1).
    public int maxProfit(int[] prices) {
        int maxProfit = 0, minPrice = Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++) {

            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }

        return maxProfit;
        
    }
}

