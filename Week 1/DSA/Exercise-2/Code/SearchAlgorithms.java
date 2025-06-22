import java.util.Arrays;
import java.util.Comparator;

public class SearchAlgorithms {
    // Linear search by name
    public static Product linearSearch(Product[] products, String name) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    // Binary search by ID (assumes sorted array)
    public static Product binarySearchById(Product[] products, int id) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].getId() == id) {
                return products[mid];
            } else if (products[mid].getId() < id) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    // Sort by ID for binary search
    public static void sortById(Product[] products) {
        Arrays.sort(products, Comparator.comparingInt(Product::getId));
    }
}
