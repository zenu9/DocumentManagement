public class ReportFactory extends DocumentFactory {
    @Override
    public Document createDocument(String content) {
        return new Report(content);
    }
}
