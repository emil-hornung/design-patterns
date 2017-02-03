package pl.hornunge.structural.proxy.report_generator;

public class ExpensiveReportGenerator implements ReportGenerator {

    public ExpensiveReportGenerator() {
        System.out.println("This initialization is very expensive (in terms of time and resources).");
    }

    @Override
    public void generateReport() {
        System.out.println("Generating report.");
    }
}
