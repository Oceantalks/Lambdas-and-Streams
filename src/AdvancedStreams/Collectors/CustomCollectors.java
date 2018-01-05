package AdvancedStreams.Collectors;

import root.CreateTradeList;
import root.Trade;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.summarizingInt;

/**
 * Created by Ado on 2018-01-05.
 */
public class CustomCollectors {
    List<Trade> trades = new CreateTradeList().getTradeList();

    private void collectIntoCustomCollector() {
        Supplier<StringBuilder> supplier = StringBuilder::new;

        BiConsumer<StringBuilder, Trade> accumulator =
                (sb, trade) -> sb.append(trade.getNameOfTrade()).append(", ");

        BiConsumer<StringBuilder, StringBuilder> combiner =
                (s1, s2) -> s1.append(s2.toString());

        StringBuilder results = trades.stream()
                .collect(supplier, accumulator, combiner);

        System.out.println(results);
    }

    private void stats() {
        IntSummaryStatistics sumStat = trades.stream()
                .collect(summarizingInt(Trade::getQuantity));

        System.out.println(sumStat);
    }

    public static void main(String[] args) {
        CustomCollectors streams = new CustomCollectors();
        streams.collectIntoCustomCollector();
        streams.stats();
    }
}
