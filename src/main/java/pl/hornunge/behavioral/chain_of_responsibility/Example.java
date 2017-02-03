package pl.hornunge.behavioral.chain_of_responsibility;

import pl.hornunge.behavioral.chain_of_responsibility.email.Email;
import pl.hornunge.behavioral.chain_of_responsibility.email_handler.EmailHandler;
import pl.hornunge.behavioral.chain_of_responsibility.email_handler.EmailHandlerChainFactory;

public class Example {
    public static void main(String[] args) {
        EmailHandlerChainFactory emailHandlerChainFactory = new EmailHandlerChainFactory();
        EmailHandler emailHandlerChain = emailHandlerChainFactory.createEmailHandlerChain();

        emailHandlerChain.handleEmail(new Email("asd@gmail.com"));
        emailHandlerChain.handleEmail(new Email("asd@o2.pl"));
        emailHandlerChain.handleEmail(new Email("asd@interia.pl"));
        emailHandlerChain.handleEmail(new Email("asd@some.other.domain.com"));
        //please note, that last email wasn't handle at all, we can address it by adding some default handler if needed
    }

}
