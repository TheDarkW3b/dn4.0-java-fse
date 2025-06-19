public class FactoryPatternTest {
    public static void main(String[] args) {
        Document doc1 = DocumentFactory.getDocument("word");
        Document doc2 = DocumentFactory.getDocument("pdf");
        Document doc3 = DocumentFactory.getDocument("excel");

        doc1.open();
        doc2.open();
        doc3.open();
    }
}
