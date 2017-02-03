package pl.hornunge.behavioral.observer.subject;

import pl.hornunge.behavioral.observer.observer.AuctionObserver;

public interface ObservableAuction {
    void addObserver(AuctionObserver observer);
    void removeObserver(AuctionObserver observer);
    void notifyAboutBidChanged();
}
