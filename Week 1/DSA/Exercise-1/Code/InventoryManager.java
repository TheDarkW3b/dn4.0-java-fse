import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    private Map<Integer, Product> products = new HashMap<>();

    public void addProduct(Product product) {
        if (products.containsKey(product.getId())) {
            System.out.println("Product with this ID already exists.");
        } else {
            products.put(product.getId(), product);
            System.out.println("Product added.");
        }
    }

    public void updateProduct(Product updated) {
        if (products.containsKey(updated.getId())) {
            products.put(updated.getId(), updated);
            System.out.println("Product updated.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void deleteProduct(int id) {
        if (products.remove(id) != null) {
            System.out.println("Product deleted.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void viewCatalog() {
        if (products.isEmpty()) {
            System.out.println("No products in inventory.");
            return;
        }
        System.out.println("== Product Catalog ==");
        for (Product p : products.values()) {
            System.out.println(p);
        }
    }
}
