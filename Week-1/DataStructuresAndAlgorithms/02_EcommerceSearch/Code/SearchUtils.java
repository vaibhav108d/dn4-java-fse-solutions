import java.util.ArrayList;
public class SearchUtils{
    //Linear search algorithm
    public int LinearSearch(ArrayList<Product> products, int targetId) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductId() == targetId) {
                return i; // Return the index of the found product
            }
        }
        return -1; // Return -1 if not found
    }

    //Binary search algorithm
    public int BinarySearch(ArrayList<Product> products, int targetId) {
        int left = 0;
        int right = products.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products.get(mid).getProductId() == targetId) {
                return mid; // Return the index of the found product
            }
            if (products.get(mid).getProductId() < targetId) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return -1; // Return -1 if not found
    }
}