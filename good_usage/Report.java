package good_usage;

import java.util.Map;

public class Report {
    private String title;
    private Map<String, Integer> data;

    public Report(String title, Map<String, Integer> data) {
        this.title = title;
        this.data = data;
    }

    public String getTitle() {
        return title;
    }

    public Map<String, Integer> getData() {
        return data;
    }
}
