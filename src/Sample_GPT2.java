import java.io.*;

public class Sample_GPT2 {
    public static void main(String[] args) {
        String filePath = "example.txt";
        String content = "Hello, this is a test of java.io.";

        // 寫入檔案
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }

        // 讀取檔案
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Reading from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
