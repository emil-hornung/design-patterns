package pl.hornunge.behavioral.template_method;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public abstract class ReportPrinter {

    public void printReport() {
        initData();
        System.out.println(getHeader());
        int counter = 0;
        while (!dataFinished()){
            System.out.println(getCurrentRow());
            counter++;
            moveToNextRow();
        }
        System.out.println("Total rows count: " + counter);
        System.out.println(getFooter());
        cleanUpData();
    }

    protected abstract void initData();

    protected abstract String getHeader();

    protected abstract boolean dataFinished();

    protected abstract String getCurrentRow();

    protected abstract void moveToNextRow();

    protected abstract String getFooter();

    protected abstract void cleanUpData();
}
