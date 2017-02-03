package pl.hornunge.structural.proxy.report_generator;

public class ExpensiveReportGeneratorProxy implements ReportGenerator{
    ReportGenerator reportGenerator;

    @Override
    public void generateReport() {
        if (reportGenerator == null){
            reportGenerator = new ExpensiveReportGenerator();
        }
        reportGenerator.generateReport();
    }
}
