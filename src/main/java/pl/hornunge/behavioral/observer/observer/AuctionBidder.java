package pl.hornunge.behavioral.observer.observer;

import java.math.BigDecimal;

public class AuctionBidder implements AuctionObserver{

    private final String name;

    public AuctionBidder(String name) {
        this.name = name;
    }

    @Override
    public void bidChanged(String auctionName, String bidderName, BigDecimal newBid) {
        System.out.println(String.format("%s was notified that current bid for %s is %s and was placed by %s.", this.name, auctionName, newBid, bidderName));
    }

    public String getName() {
        return name;
    }
}
