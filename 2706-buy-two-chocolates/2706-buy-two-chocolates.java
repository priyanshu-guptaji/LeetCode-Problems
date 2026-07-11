class Solution {
    public int buyChoco(int[] prices, int money) {

        int cheap = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int price : prices) {

            if (price < cheap) {
                second = cheap;
                cheap = price;
            } else if (price < second) {
                second = price;
            }
        }

        int total = cheap + second;

        if (total <= money) {
            return money - total;
        }

        return money;
    }
}