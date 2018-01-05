package AdvancedStreams.RangeAndStats;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * Created by Ado on 2018-01-05.
 */
public class RangeAndStats {

    private void testRange() {
        IntStream streamOfInts = IntStream.range(1, 100);
        streamOfInts.forEach(System.out::println);
    }

    private void testMinAndMax() {
        IntStream streamOfInts = IntStream.rangeClosed(1, 100);
        System.out.println("Whole interval (.rangeClosed): ");
        streamOfInts.forEach(System.out::println);

        streamOfInts = IntStream.rangeClosed(1, 100);
        OptionalInt max = streamOfInts.max();
        System.out.println("Max: " + max.getAsInt());

        streamOfInts = IntStream.rangeClosed(1, 100);
        OptionalInt min = streamOfInts.max();
        System.out.println("Min: " + min.getAsInt());

        streamOfInts = IntStream.rangeClosed(1, 100);
        OptionalDouble avg = streamOfInts.average();
        System.out.println("Avg: " + avg.getAsDouble());
    }

    public static void main(String[] args) {
        RangeAndStats streams = new RangeAndStats();
        streams.testRange();
        streams.testMinAndMax();
    }
}
