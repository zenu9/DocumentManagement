import java.io.FileWriter;

public class Invoice implements Document {
    private String content;
    public Invoice(String content) {
        this.content = content;
    }
    @Override
    public void generate(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("--Invoice--\n");
            writer.write(content);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
