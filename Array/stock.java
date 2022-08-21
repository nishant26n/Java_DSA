package Array;

class stock {

  static int maxProfit(int[] prices) {
    if (prices == null || prices.length <= 1) return 0;

    int low = prices[0];
    int result = 0;

    for (int i = 1; i < prices.length; i++) {
      low = Math.min(low, prices[i]);
      result = Math.max(result, prices[i] - low);
    }

    return result;
  }

  public static void main(String[] args) {
    int[] prices = { 7, 1, 5, 3, 6, 4 };

    System.out.println(maxProfit(prices));
  }
}
