package good_usage;

public class ReportFormatter {

    public String format(Report report) {
        StringBuilder sb = new StringBuilder();
        sb.append("Rapor: ").append(report.getTitle()).append("\n");
        sb.append("----------------------\n");
        report.getData().forEach((key, value) ->
            sb.append(key).append(": ").append(value).append("\n")
        );
        return sb.toString();
    }
}
