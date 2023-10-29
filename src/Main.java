public class Main {
    public static void main(String[] args) {
        DocumentFactory contractFactory = new ContractFactory();
        Document contract = contractFactory.createDocument("This is a contract for the supply of goods.");
        contract.generate("C:\\Users\\mugiwara\\Documents" +
                "\\Design Patterns\\DocumentManagement\\src\\contract.txt");

        DocumentFactory invoiceFactory = new InvoiceFactory();
        Document invoice = invoiceFactory.createDocument("Payment is due within 30 days of receiving the invoice." +
                "This invoice states that we will have to pay $1,500.");
        invoice.generate("C:\\Users\\mugiwara\\Documents" +
                "\\Design Patterns\\DocumentManagement\\src\\invoice.txt");

        DocumentFactory reportFactory = new ReportFactory();
        Document report = reportFactory.createDocument("A report on how I wrote the synopsis for the film.");
        report.generate("C:\\Users\\mugiwara\\Documents" +
                "\\Design Patterns\\DocumentManagement\\src\\report.txt");
    }
}