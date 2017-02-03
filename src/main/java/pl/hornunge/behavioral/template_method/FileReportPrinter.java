package pl.hornunge.behavioral.template_method;

public class FileReportPrinter extends ReportPrinter {
    @Override
    protected void initData() {
        //open file
        //read first line
    }

    @Override
    protected String getHeader() {
        return null; //return name of file
    }

    @Override
    protected boolean dataFinished() {
        return false; //return (is it EOF?)
    }

    @Override
    protected String getCurrentRow() {
        return null; //return current line
    }

    @Override
    protected void moveToNextRow() {
        //read next line
    }

    @Override
    protected String getFooter() {
        return null; //return name of file
    }

    @Override
    protected void cleanUpData() {
        //close file
    }
}
