package Streams.IntroductionStreams;

import Util.CreateTradeList;
import Util.Trade;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Ado on 2017-12-28.
 */
public class StreamBasics {

    private void findLargeTradesWithStreams(List<Trade> trades){

        List<String> largeTrades = trades.stream()
                .filter(trade -> trade.getQuantity() > 1000)
                .map(Trade::getNameOfTrade)
                .collect(Collectors.toList());

        System.out.println("LargeTrades: " + largeTrades);

    }

    private void findSegmentTradesWithStreams(List<Trade> trades) {
        trades.stream()
                .filter(trade -> ("IT").equals(trade.getSegmentOfTrade()))
                .map(Trade::getSegmentOfTrade)
                .distinct()
                .forEach(System.out::println);
    }

    private void findLargeTradesPreJava8() {
    }

    public static void main(String[] args) {
        StreamBasics stream = new StreamBasics();
        CreateTradeList list = new CreateTradeList();
        stream.findLargeTradesWithStreams(list.getTradeList());
        stream.findSegmentTradesWithStreams(list.getTradeList());
        stream.findLargeTradesPreJava8();
    }


}
