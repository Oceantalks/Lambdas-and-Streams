package CommonStreams.CollectionStreams;

import root.CreateTradeList;
import root.Trade;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;

/**
 * Created by Ado on 2018-01-03.
 */
public class CollectionStreams {

    List<Trade> tradeList = new CreateTradeList().getTradeList();

    private void CollectToAList() {
        List<Trade> list = tradeList.stream()
                // Static import - Instead of writing collection(Collection.toList());
                .collect(toList());
        System.out.println(list);
    }

    private void CollectToASet() {
        Set<Trade> tradeSet = tradeList.stream()
                // Static import - Instead of writing collection(Collection.toSet());
                .collect(toSet());
        System.out.println(tradeSet);
    }

    private void CollectToAMap() {
        Map<String, Trade> tradeMap = tradeList.stream()
                // Static import - Instead of writing collection(Collection.toMap(Key, Value));
                .collect(toMap(Trade::getNameOfTrade, trade -> trade));
        System.out.println(tradeMap);
    }

    public static void main(String[] args) {
        CollectionStreams collectionStreams = new CollectionStreams();
        collectionStreams.CollectToAList();
        collectionStreams.CollectToASet();
        collectionStreams.CollectToAMap();
    }
}
