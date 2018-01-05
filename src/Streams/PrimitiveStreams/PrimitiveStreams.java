package Streams.PrimitiveStreams;

import Util.CreateTradeList;
import Util.Trade;

import java.util.List;
import java.util.Optional;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 * Created by Ado on 2017-12-28.
 */
public class PrimitiveStreams {
    List<Trade> tradeList = new CreateTradeList().getTradeList();

    public static void main(String[] args) {
        PrimitiveStreams primitiveStreams = new PrimitiveStreams();
        primitiveStreams.tradeQuantity();
        primitiveStreams.IntStream();
        primitiveStreams.doubleStream();
        primitiveStreams.convertStream();
    }

    private void convertStream() {
        int sumQuantity = tradeList.stream()
                .mapToInt(Trade::getQuantity).sum();
    }

    private void doubleStream() {
        double[] doubles = new double[] {2.1,4.3,6.5,8.7,10.9};

        DoubleStream doubleStream = DoubleStream.of(doubles);
        doubleStream.forEach(System.out::println);

        DoubleStream doubleStream1 = DoubleStream.of(1.2,3.4,5.6,7.8,9.10);
        doubleStream1.forEach(System.out::println);
    }

    private void IntStream() {
        int[] ints = new int[] {2,4,6,8,10};

        IntStream intStream = IntStream.of(ints);
        intStream.forEach(System.out::println);

        IntStream intStream1 = IntStream.of(1,3,5,7,9);
        intStream1.forEach(System.out::println);
    }

    private void tradeQuantity() {
        Optional<Integer> quantity = tradeList.stream()
                .map(Trade::getQuantity)
                .reduce(Integer::sum);
    }
}
