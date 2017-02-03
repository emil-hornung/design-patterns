package pl.hornunge.behavioral.template_method;

public class DatabaseReportPrinter extends ReportPrinter {
    @Override
    protected void initData() {
        //connect to database, init table read
    }

    @Override
    protected String getHeader() {
        //return table name
        return null;
    }

    @Override
    protected boolean dataFinished() {
        //are there results in resultsets?
        return false;
    }

    @Override
    protected String getCurrentRow() {
        //read current row from result set and change it to String
        return null;
    }

    @Override
    protected void moveToNextRow() {
        //probably do nothing
    }

    @Override
    protected String getFooter() {
        //return table name as well
        return null;
    }

    @Override
    protected void cleanUpData() {
        //disconnect from database
    }
}
