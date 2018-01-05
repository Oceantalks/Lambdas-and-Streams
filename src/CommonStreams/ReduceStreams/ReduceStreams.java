package CommonStreams.ReduceStreams;

import root.CreateTradeList;
import root.Trade;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by Ado on 2018-01-03.
 */
public class ReduceStreams {
    List<Trade> tradeList = new CreateTradeList().getTradeList();
    List<Integer> integerList = Arrays.asList();

    private void tradeSegmentList() {
        Optional<String> segList = tradeList.stream()
                .map(Trade::getSegmentOfTrade)
                //.distinct()
                .reduce((a,b) -> a + "," + b);
        System.out.println(segList);
    }

    private void schoolstaff() {

    }

    private void tradeQuantitySum() {
        Optional<Integer> quantitySum = tradeList.stream()
                .map(Trade::getQuantity)
                .reduce((a,b) -> a+b);
        System.out.println(quantitySum);
    }

    public static void main(String[] args) {
        ReduceStreams streams = new ReduceStreams();
        streams.tradeSegmentList();
        streams.schoolstaff();
        streams.tradeQuantitySum();
    }
}
