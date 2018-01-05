package CommonStreams.DistinctLimitSkip;

import Util.CreateTradeList;
import Util.Trade;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Ado on 2018-01-03.
 */
public class DiLiSk {
    List<Trade> tradeList = new CreateTradeList().getTradeList();

    private String nextLine() {
        return "-----------------------";
    }

    //
    private void testDistinct() {
        Stream<String> stringStream = tradeList.stream()
                .map(Trade::getNameOfTrade)
                .distinct();
        stringStream.forEach(trade -> {
            System.out.println(trade);
            System.out.println(nextLine());
        });
    }

    private void testLimit() {
        Stream<String> stringStream = tradeList.stream()
                .map(Trade::getNameOfTrade)
                .distinct()
                .limit(4);
        stringStream.forEach(trade -> {
            System.out.println(trade);
        });
    }

    private void testSkip() {
        Stream<String> stringStream = tradeList.stream()
                .map(Trade::getNameOfTrade)
                .skip(3);
        stringStream.forEach(trade -> {
            System.out.println(trade);
            System.out.println(nextLine());
        });

    }

    public static void main(String[] args) {
        DiLiSk diLiSk = new DiLiSk();
        diLiSk.testDistinct();
        diLiSk.testLimit();
        diLiSk.testSkip();
    }
}
