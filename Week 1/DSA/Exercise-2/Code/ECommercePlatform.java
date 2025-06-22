public class ECommercePlatform {
    public static void main(String[] args) {
        Product[] products = {
            new Product(103, "Pen"),
            new Product(101, "Notebook"),
            new Product(102, "Pencil"),
            new Product(104, "Eraser")
        };

        System.out.println("== Linear Search (by Name) ==");
        Product result = SearchAlgorithms.linearSearch(products, "Pencil");
        System.out.println(result != null ? "Found: " + result : "Not found.");

        System.out.println("\n== Binary Search (by ID) ==");
        SearchAlgorithms.sortById(products);
        Product result2 = SearchAlgorithms.binarySearchById(products, 101);
        System.out.println(result2 != null ? "Found: " + result2 : "Not found.");
    }
}
