package CommonStreams.MappingStreams;

import root.CreateTradeList;
import root.Trade;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Ado on 2018-01-03.
 */
public class MappingStreams {

    List<Trade> tradeList = new CreateTradeList().getTradeList();

    // Loop through and print name of trade with uppercase
    private void testMapping() {
        Stream<String> stream = tradeList.stream()
                .map(Trade::getNameOfTrade)
                .map(String::toUpperCase);
        stream.forEach(System.out::println);
    }

    public static void main(String[] args) {
        MappingStreams mappedStream = new MappingStreams();
        mappedStream.testMapping();
    }

}
