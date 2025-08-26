public class BestTimeToByeandSellStocks {

    public static int ByeandSellStocks(int[] prices) {
        int byePrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i<prices.length; i++) {
            if(prices[i] < byePrice) {
                byePrice = prices[i];
            } else if(prices[i] - byePrice > maxProfit) {
                maxProfit = prices[i] - byePrice;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        System.out.println(ByeandSellStocks(arr));
    }
}
