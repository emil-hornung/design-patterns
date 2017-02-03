package pl.hornunge.behavioral.chain_of_responsibility.email_handler;

import pl.hornunge.behavioral.chain_of_responsibility.email.Email;

public class GMailEmailHandler extends EmailHandler {
    @Override
    protected boolean applicable(Email email) {
        return email.getAddressFrom().endsWith("@gmail.com");
    }

    @Override
    protected void doHandleEmail(Email email) {
        System.out.println(String.format("Handling email from %s by GmailEmailHandler.", email.getAddressFrom()));
    }
}
