package AdvancedStreams.FlatMap;

import root.CreateTradeList;
import root.ShareHolders;
import root.Trade;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Ado on 2018-01-05.
 */
public class FlatMap {
    List<Trade> trades = new CreateTradeList().getTradeList();

    private void testFlatMappingShareHolders() {
        Stream<ShareHolders> shareH = trades.stream()
                .flatMap(t -> t.getSh().stream());

        shareH.forEach(System.out::println);
    }

    public static void main(String[] args) {
        FlatMap streams = new FlatMap();
        streams.testFlatMappingShareHolders();
    }
}
