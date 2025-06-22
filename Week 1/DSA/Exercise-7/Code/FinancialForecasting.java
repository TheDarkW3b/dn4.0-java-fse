public class FinancialForecasting {
    public static int predictProfit(int year) {
        if (year == 0) return 1000;
        if (year == 1) return 1500;
        return predictProfit(year - 1) + predictProfit(year - 2);
    }

    public static void main(String[] args) {
        int years = 10;
        System.out.println("Financial Forecast (Recursive):");
        for (int i = 0; i <= years; i++) {
            System.out.println("Year " + i + ": ₹" + predictProfit(i));
        }
    }
}
