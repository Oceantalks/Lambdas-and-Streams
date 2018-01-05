package AdvancedStreams.ParallelMeasurements;

import Util.CreateTradeList;
import Util.Trade;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

/**
 * Created by Ado on 2018-01-05.
 */
public class ParallelStreams {
    List<Trade> trades = new CreateTradeList().getTradeList();

    private void sumTradeInSerial() {
        Instant start = Instant.now();

        trades.stream()
                .map(Trade::getQuantity)
                .reduce(Integer::sum);

        Instant end = Instant.now();
        Duration d = Duration.between(start, end);
        System.out.printf("%s %d %s", "Aggregating trades took ", d.toMillis(), " ms in Sequential mode");
    }

    private void sumTradesInParallel() {
        Instant start = Instant.now();

        trades.stream()
                .parallel()
                .map(Trade::getQuantity)
                .reduce(Integer::sum);

        Instant end = Instant.now();
        Duration d = Duration.between(start, end);
        System.out.println();
        System.out.printf("%s %d %s", "Aggregating trades took ", d.toMillis(), " ms in Parallel mode");
    }

    public static void main(String[] args) {
        ParallelStreams streams = new ParallelStreams();
        streams.sumTradeInSerial();
        streams.sumTradesInParallel();
    }
}
