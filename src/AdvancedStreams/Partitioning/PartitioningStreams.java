package AdvancedStreams.Partitioning;

import Util.CreateTradeList;
import Util.Trade;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.partitioningBy;

/**
 * Created by Ado on 2018-01-04.
 */
public class PartitioningStreams {
    List<Trade> trades = new CreateTradeList().getTradeList();

    // General: Partitioning is based on a boolean key and grouping is based on a string key
    private void partitionByIsRisky() {
        Map<Boolean, List<Trade>> riskyMap = trades.stream()
                .collect(partitioningBy(Trade::isBigRisk));
        System.out.println(riskyMap);
    }

    private void partitioningAndGrouping() {
        Map<Boolean, Map<String, List<Trade>>> segmentedRisk = trades.stream()
                .collect(partitioningBy((Trade::isBigRisk), groupingBy(Trade::getSegmentOfTrade)));
        System.out.println(segmentedRisk);

        for(Boolean b: segmentedRisk.keySet()){
            System.out.println(b + "--->" + segmentedRisk.get(b));
        }
    }


    private void partitionMultilevel() {
        Map<Boolean, Map<Boolean, List<Trade>>> multiPartitionedTradeList = trades.stream()
                .collect(partitioningBy((Trade::isBigRisk), partitioningBy(Trade::isCheap)));

        for(Boolean b: multiPartitionedTradeList.keySet()) {
            System.out.println(b + "--->" + multiPartitionedTradeList.get(b));
        }
    }

    public static void main(String[] args) {
        PartitioningStreams streams = new PartitioningStreams();
        streams.partitionByIsRisky();
        streams.partitioningAndGrouping();
        streams.partitionMultilevel();
    }



}
