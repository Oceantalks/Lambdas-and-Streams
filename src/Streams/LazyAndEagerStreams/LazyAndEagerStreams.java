package Streams.LazyAndEagerStreams;

import Util.CreateTradeList;
import Util.Trade;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Ado on 2017-12-28.
 */
public class LazyAndEagerStreams {

    List<Trade> trades = new CreateTradeList().getTradeList();

    private void testLazyStream(){
        trades.stream()
                .filter(t -> {
                    System.out.println("Inside lazy operation");
                    return t.getQuantity() > 800;
                })
                .map(Trade::getNameOfTrade)
                .count();
    }

    private void testEagerStream() {
        Stream<Trade> tradeStream = trades.stream()
                .filter(t -> {
                    System.out.println("Filtering");
                    return t.getQuantity() < 800;
                })
                .map(t -> {
                    System.out.println("Mapping");
                    return t;
                });
        System.out.println("Count: " + tradeStream.count());
    }

    public static void main(String[] args) {
        LazyAndEagerStreams streams = new LazyAndEagerStreams();
        streams.testLazyStream();
        streams.testEagerStream();
    }

}
