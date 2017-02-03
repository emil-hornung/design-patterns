package pl.hornunge.structural.proxy.report_generator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ExpensiveReportGeneratorInvocationHandler implements InvocationHandler {

    private ExpensiveReportGenerator reportGenerator;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("ExpensiveReportGeneratorInvocationHandler invoke executed.");
        if (reportGenerator == null) {
            reportGenerator = new ExpensiveReportGenerator();
        }
        return method.invoke(reportGenerator, args);
    }
}
