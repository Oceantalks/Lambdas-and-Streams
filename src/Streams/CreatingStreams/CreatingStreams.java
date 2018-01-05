package Streams.CreatingStreams;

import root.CreateTradeList;
import root.Trade;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Ado on 2017-12-28.
 */
public class CreatingStreams {

    public static void main(String[] args) {
        CreatingStreams streams = new CreatingStreams();
        streams.testCollectionStreams();
        streams.testArrayStreams();
        streams.testEmptyStreams();
        //streams.testGenerateIterateStreams();
    }

    private void testGenerateIterateStreams() {
        Stream<Double> randomStream = Stream.generate(Math::random);
        randomStream.forEach(System.out::println);
    }

    // Empty stream
    private void testEmptyStreams() {
        Stream<Trade> tradeEmptyStream = Stream.empty();
        System.out.println("Empty stream: " + tradeEmptyStream.count());
    }

    // From values/arrays
    private void testArrayStreams() {
        Stream<String> movieNames = Stream.of("Die Hard", "Ocean Thirteen", "Hangover");
        System.out.println("Number of movies: " + movieNames.count());
    }

    // From Collections
    private void testCollectionStreams() {
        List<Trade> trades = new CreateTradeList().getTradeList();
        trades.stream()
                .map(Trade::getNameOfTrade)
                .forEach(System.out::println);
    }

}
