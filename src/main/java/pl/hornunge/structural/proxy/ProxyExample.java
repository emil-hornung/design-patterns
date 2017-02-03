package pl.hornunge.structural.proxy;

import pl.hornunge.structural.proxy.report_generator.ExpensiveReportGenerator;
import pl.hornunge.structural.proxy.report_generator.ExpensiveReportGeneratorProxy;
import pl.hornunge.structural.proxy.report_generator.ReportGenerator;

public class ProxyExample {
    public static void main(String[] args) {
        ReportGenerator reportGenerator;

        reportGenerator = new ExpensiveReportGenerator();
        System.out.println("Please note, that very expensive initialization has been already made - which we would like to defer.");
        reportGenerator.generateReport();

        reportGenerator = new ExpensiveReportGeneratorProxy();
        System.out.println("Now initialization hasn't been made yet. It will be deferred only before generating the report.");
        reportGenerator.generateReport();
    }
}
