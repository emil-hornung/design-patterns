package pl.hornunge.behavioral.observer;

import pl.hornunge.behavioral.observer.observer.AuctionBidder;
import pl.hornunge.behavioral.observer.subject.Auction;

import java.math.BigDecimal;

public class ObserverExample {
    public static void main(String[] args) {
        Auction auction1 = new Auction("TV", new BigDecimal("10"));
        AuctionBidder bidderJohn = new AuctionBidder("John");
        AuctionBidder bidderKate = new AuctionBidder("Kate");
        AuctionBidder bidderBob = new AuctionBidder("Bob");

        auction1.addObserver(bidderJohn);
        auction1.addObserver(bidderKate);
        auction1.addObserver(bidderBob);

        auction1.placeBid(new BigDecimal("11"),bidderKate);
        System.out.println("---");
        auction1.placeBid(new BigDecimal("12"),bidderBob);
        System.out.println("---");
        auction1.placeBid(new BigDecimal("15"),bidderJohn);
        System.out.println("---");

    }
}
