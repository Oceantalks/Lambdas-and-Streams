package CommonStreams.CommonStreams;

import Util.CreateTradeList;
import Util.Trade;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Ado on 2017-12-28.
 */
public class IntroductionCommonStreams {

    List<Trade> trades = new CreateTradeList().getTradeList();


    private void testFiltering() {
        Stream<Trade> tradeStream = trades.stream()
                .filter(Trade::isBigRisk)
                .filter(t -> t.getQuantity() < 1250)
                .limit(2);

        tradeStream.forEach(System.out::println);
    }

    public static void main(String[] args) {
        IntroductionCommonStreams common = new IntroductionCommonStreams();
        common.testFiltering();
    }

}
