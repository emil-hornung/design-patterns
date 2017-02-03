package pl.hornunge.behavioral.observer.observer;

import java.math.BigDecimal;

public interface AuctionObserver {
    void bidChanged(String auctionName, String bidderName, BigDecimal newBid);
}
