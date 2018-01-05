package AdvancedStreams.Introduction;

import root.CreateTradeList;
import root.Trade;

import java.security.acl.Group;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.groupingBy;


/**
 * Created by Ado on 2018-01-04.
 */
public class GroupingStreams {
    List<Trade> tradeList = new CreateTradeList().getTradeList();

    private void groupingBySegment() {
        Map<String, List<Trade>> segmentTrades = tradeList.stream()
                .collect(Collectors.groupingBy(t -> t.getSegmentOfTrade()));
        System.out.println(segmentTrades);
        System.out.println(segmentTrades.get("CryptoCurrency"));
    }

    private void groupingBySegmentAndRisk() {
        Map<String, Map<Boolean, List<Trade>>> segAndRisk = tradeList.stream()
                .collect(groupingBy((Trade::getSegmentOfTrade), groupingBy(Trade::isBigRisk)));
        System.out.println(segAndRisk);
        System.out.println(segAndRisk.get("OIL").get(true));
    }

    private void groupingByList() {

    }

    private void groupingByCount() {

    }

    public static void main(String[] args) {
        GroupingStreams streams = new GroupingStreams();
        streams.groupingBySegment();
        streams.groupingBySegmentAndRisk();
        streams.groupingByList();
        streams.groupingByCount();
    }

}
