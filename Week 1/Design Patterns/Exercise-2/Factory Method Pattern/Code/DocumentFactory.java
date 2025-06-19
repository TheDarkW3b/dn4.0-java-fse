public class DocumentFactory {
    public static Document getDocument(String type) {
        switch (type.toLowerCase()) {
            case "word":
                return new WordDocument();
            case "pdf":
                return new PdfDocument();
            case "excel":
                return new ExcelDocument();
            default:
                throw new IllegalArgumentException("Unknown document type: " + type);
        }
    }
}
