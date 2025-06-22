import java.util.Scanner;

public class ForecastTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial investment amount: ");
        double initial = scanner.nextDouble();

        System.out.print("Enter annual growth rate (e.g., 0.1 for 10%): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter number of years to forecast: ");
        int years = scanner.nextInt();

        double recursive = ForecastUtil.calculateRecursive(initial, rate, years);
        double iterative = ForecastUtil.calculateIterative(initial, rate, years);

        System.out.printf("Recursive: INR %.2f\n", recursive);
        System.out.printf("Iterative: INR %.2f\n", iterative);

        scanner.close();
    }
}


/**
     * Optimization Explanation:
     * 
     * Recursive solutions can be inefficient due to repeated calls and deep call stacks.
     * To optimize:
     * - Use Tail Recursion: carry state in parameters to reduce call depth
     * - Use Memoization: cache and reuse results of subproblems
     * - Use Iteration: convert recursion to loop for better performance
     */