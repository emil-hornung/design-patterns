package pl.hornunge.behavioral.chain_of_responsibility.email_handler;

import pl.hornunge.behavioral.chain_of_responsibility.email_handler.EmailHandler;
import pl.hornunge.behavioral.chain_of_responsibility.email_handler.GMailEmailHandler;
import pl.hornunge.behavioral.chain_of_responsibility.email_handler.InteriaEmailHandler;
import pl.hornunge.behavioral.chain_of_responsibility.email_handler.O2EmailHandler;

public class EmailHandlerChainFactory {

    public EmailHandler createEmailHandlerChain(){
        EmailHandler firstEmailHandler = new GMailEmailHandler();
        EmailHandler secondEmailHandler = new O2EmailHandler();
        EmailHandler thirdEmailHandler = new InteriaEmailHandler();

        firstEmailHandler.setNextHandler(secondEmailHandler);
        secondEmailHandler.setNextHandler(thirdEmailHandler);

        return firstEmailHandler;
    }

}
