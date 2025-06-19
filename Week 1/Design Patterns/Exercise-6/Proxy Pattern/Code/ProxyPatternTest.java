public class ProxyPatternTest {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("photo1.jpg");

        // First call — loads from disk
        img1.display();

        // Second call — doesn't load again
        img1.display();
    }
}
