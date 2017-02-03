package pl.hornunge.behavioral.chain_of_responsibility.email_handler;

import pl.hornunge.behavioral.chain_of_responsibility.email.Email;

public abstract class EmailHandler {

    private EmailHandler nextHandler;

    public void handleEmail(Email email) {
        if (applicable(email)) {
            doHandleEmail(email);
        } else {
            //This is an exclusive version, meaning that handler either handles the request or pass it to the next handler.
            //However, in my opinion, not exclusive version is also possible. It's just a matter of the current problem.
            handleByNextHandlerIfSet(email);
        }
    }

    private void handleByNextHandlerIfSet(Email email) {
        if (nextHandler != null) {
            nextHandler.handleEmail(email);
        }
    }

    protected abstract boolean applicable(Email email);

    protected abstract void doHandleEmail(Email email);

    public void setNextHandler(EmailHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
