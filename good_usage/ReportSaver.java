package good_usage;

import java.io.FileWriter;
import java.io.IOException;

public class ReportSaver {

    public void saveToFile(String content, String path) {
        try (FileWriter writer = new FileWriter(path)) {
            writer.write(content);
            System.out.println("Rapor kaydedildi: " + path);
        } catch (IOException e) {
            System.out.println("Dosya kaydedilirken hata oluştu: " + e.getMessage());
        }
    }
}
