package good_usage;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> data = new HashMap<>();
        data.put("Satış", 1200);
        data.put("Kâr", 300);

        Report report = new Report("Aylık Rapor", data);
        ReportFormatter formatter = new ReportFormatter();
        ReportSaver saver = new ReportSaver();

        String content = formatter.format(report);
        saver.saveToFile(content, "report.txt");
    }
}
