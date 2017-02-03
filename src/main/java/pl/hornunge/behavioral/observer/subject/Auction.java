package pl.hornunge.behavioral.observer.subject;

import pl.hornunge.behavioral.observer.observer.AuctionBidder;
import pl.hornunge.behavioral.observer.observer.AuctionObserver;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Auction implements ObservableAuction {

    private final String name;
    private BigDecimal currentBid;
    private AuctionBidder currentBidder;

    Set<AuctionObserver> observers = new HashSet<>();

    public Auction(String name, BigDecimal initialPrice) {
        this.name = name;
        this.currentBid = initialPrice;
    }

    public void placeBid(BigDecimal newBid, AuctionBidder bidderName){
       if (newBid.compareTo(currentBid) == 1){
           currentBid = newBid;
           currentBidder = bidderName;
           notifyAboutBidChanged();
       }
    }

    @Override
    public void addObserver(AuctionObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(AuctionObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAboutBidChanged() {
        observers
                .stream()
                .filter(observer -> !observer.equals(currentBidder))
                .forEach(observer -> observer.bidChanged(name, currentBidder.getName(), currentBid));
    }

}
