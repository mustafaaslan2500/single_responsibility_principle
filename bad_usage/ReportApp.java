package bad_usage;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReportApp {

    private String title;
    private Map<String, Integer> data;

    public ReportApp(String title, Map<String, Integer> data) {
        this.title = title;
        this.data = data;
    }

    public String generateReport() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rapor: ").append(title).append("\n");
        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            sb.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }

    public void saveToFile(String path) {
        try (FileWriter writer = new FileWriter(path)) {
            writer.write(generateReport());
            System.out.println("Rapor kaydedildi: " + path);
        } catch (IOException e) {
            System.out.println("Dosyaya yazılamadı: " + e.getMessage());
        }
    }

    public void sendEmail(String email) {
        System.out.println(email + " adresine e-posta gönderiliyor...");
        System.out.println(generateReport());
    }

    public static void main(String[] args) {
        Map<String, Integer> data = new HashMap<>();
        data.put("Satış", 1200);
        data.put("Kâr", 300);

        ReportApp report = new ReportApp("Aylık Rapor", data);
        report.saveToFile("report.txt");
        report.sendEmail("ornek@posta.com");
    }
}
