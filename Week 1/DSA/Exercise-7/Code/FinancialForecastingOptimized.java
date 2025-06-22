public class FinancialForecastingOptimized {
    public static int predictProfit(int year, int[] dp) {
        if (year == 0) return dp[0] = 1000;
        if (year == 1) return dp[1] = 1500;
        if (dp[year] != 0) return dp[year];
        return dp[year] = predictProfit(year - 1, dp) + predictProfit(year - 2, dp);
    }

    public static void main(String[] args) {
        int years = 10;
        int[] dp = new int[years + 1];
        System.out.println("Financial Forecast (Memoized):");
        for (int i = 0; i <= years; i++) {
            System.out.println("Year " + i + ": ₹" + predictProfit(i, dp));
        }
    }
}
