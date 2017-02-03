package pl.hornunge.structural.proxy;

import pl.hornunge.structural.proxy.report_generator.ExpensiveReportGeneratorInvocationHandler;
import pl.hornunge.structural.proxy.report_generator.ReportGenerator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class JdkDynamicProxyExample {
    public static void main(String[] args) {
        ReportGenerator reportGenerator = createJdkDynamicProxyForExpensivereportGenerator();
        System.out.println("At this time reportGenerator object is created, but expensive initialization hasn't been made.");
        reportGenerator.generateReport();
    }

    private static ReportGenerator createJdkDynamicProxyForExpensivereportGenerator() {
        InvocationHandler invocationHandler = new ExpensiveReportGeneratorInvocationHandler();
        return (ReportGenerator) Proxy.newProxyInstance(
                ReportGenerator.class.getClassLoader(),
                new Class[] {ReportGenerator.class},
                invocationHandler);
    }
}
