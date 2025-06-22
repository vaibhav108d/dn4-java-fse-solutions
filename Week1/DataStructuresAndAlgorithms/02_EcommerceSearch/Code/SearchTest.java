import java.util.ArrayList;
import java.util.Scanner;

public class SearchTest {

    public static void main(String[] args) {
        ArrayList <Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop", "Electronics"));
        products.add(new Product(2, "Smartphone", "Electronics"));
        products.add(new Product(3, "T-shirt", "Clothing"));
        products.add(new Product(4, "Jeans", "Clothing"));
        products.add(new Product(5, "Headphones", "Electronics"));

        SearchUtils searchUtils = new SearchUtils();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the E-commerce Search Test!");
        System.out.println("Available Products:");
        for (Product product : products) {
            System.out.println("ID: " + product.getProductId() + ", Name: " + product.getProductName() + ", Category: " + product.getCategory());
        }   
        System.out.println("Enter Product ID:");
        int targetId = scanner.nextInt();
        scanner.close();

        // Test Linear Search
        int linearSearchResult = searchUtils.LinearSearch(products, targetId);
        System.out.println("Linear Search Result O(N):\nProduct name: " + products.get(linearSearchResult).getProductName() +"\n");

        // Test Binary Search
        // Note: Binary search requires the list to be sorted by product ID
        products.sort((p1, p2) -> p1.getProductId() - p2.getProductId());
        int binarySearchResult = searchUtils.BinarySearch(products, targetId);
        System.out.println("Binary Search Result O(logN):\nProduct name: " + products.get(binarySearchResult).getProductName() +"\n");  
    }
}
/**
         * Analysis:
         * Linear Search is simple and works on unsorted data but is slower.
         * Binary Search is faster (O(log n)) but requires sorted input.
         * For large e-commerce platforms with frequent reads, Binary Search (or better, indexing with hashmaps or trees) is more suitable.
         */