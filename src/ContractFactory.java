public class ContractFactory extends DocumentFactory {
    @Override
    public Document createDocument(String content) {
        return new Contract(content);
    }
}
