package CommonStreams.ShortCircutOperations;

import Streams.IntroductionStreams.StreamBasics;
import root.CreateTradeList;
import root.Trade;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by Ado on 2018-01-03.
 */
public class StreamFinders {
    List<Trade> tradeList = new CreateTradeList().getTradeList();

    private void testFindFirst() {
        Optional<Trade> firstTrade = tradeList.stream()
                .filter(Trade::isBigRisk)
                .findFirst();
        System.out.println("First found trade: " + firstTrade.get());
    }

    private void testFindAny() {
        Optional<Trade> anyTrade = tradeList.stream()
                .filter(Trade::isBigRisk)
                .findAny();
        System.out.println("Any trade found: " + anyTrade.get());
    }

    private void testAnyMatch() {
        Boolean anyMatch = tradeList.stream()
                .anyMatch(t -> "OIL".equals(t.getSegmentOfTrade()));
        System.out.println("Any match on Oil trade?: " + anyMatch);
    }

    private void testAllMatch() {
        Boolean allMatch = tradeList.stream()
                .allMatch(t -> "OIL".equals(t.getSegmentOfTrade()));
        System.out.println("Do all match Oil trade?: " + allMatch);

    }

    private void testNoneMatch() {
        Boolean noneMatch = tradeList.stream()
                .filter(Trade::isBigRisk)
                .noneMatch(t -> "CryptoCurrency".equals(t.getSegmentOfTrade()));
        System.out.println("Do none match CryptoCurrency trade?: " + noneMatch);
    }

    public static void main(String[] args) {
        StreamFinders streamFinders = new StreamFinders();
        streamFinders.testFindFirst();
        streamFinders.testFindAny();
        streamFinders.testAnyMatch();
        streamFinders.testAllMatch();
        streamFinders.testNoneMatch();
    }

}
