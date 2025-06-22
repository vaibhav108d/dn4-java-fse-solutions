public class ForecastUtil {

    // Time: O(n), Space: O(n) due to recursive call stack
    public static double calculateRecursive(double currentValue, double growthRate, int years) {
        if (years == 0) return currentValue;
        return calculateRecursive(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    // Time: O(n), Space: O(1)
    public static double calculateIterative(double currentValue, double growthRate, int years) {
        double result = currentValue;
        for (int i = 0; i < years; i++) {
            result *= (1 + growthRate);
        }
        return result;
    }
}
