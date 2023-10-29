import java.io.FileWriter;

public class Report implements Document {
    private String content;
    public Report(String content) {
        this.content = content;
    }
    @Override
    public void generate(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("--Report--\n");
            writer.write(content);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
