public class Reports {

    private String reportType;
    private String reportData;

    public Reports(String reportType, String reportData) {

        this.reportType = reportType;
        this.reportData = reportData;
    }

    public String getReportType() {
        return reportType;
    }

    public String getReportData() {
        return reportData;
    }

    public void displayReport() {

        System.out.println("----------------------------");
        System.out.println("Report Type : " + reportType);
        System.out.println("Report      : " + reportData);
        System.out.println("----------------------------");
    }
}
