import java.io.FileWriter;
import java.io.IOException;

public class Contract implements Document {
    private String content;
    public Contract(String content) {
        this.content = content;
    }
    @Override
    public void generate(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("--Contract--\n");
            writer.write(content);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
