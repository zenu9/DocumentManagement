public class InvoiceFactory extends DocumentFactory {
    @Override
    public Document createDocument(String content) {
        return new Invoice(content);
    }
}
