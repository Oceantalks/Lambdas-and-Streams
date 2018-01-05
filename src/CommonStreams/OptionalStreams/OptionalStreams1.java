package CommonStreams.OptionalStreams;

import Util.CreateTradeList;
import Util.Trade;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by Ado on 2018-01-03.
 */
public class OptionalStreams1 {
    List<Trade> tradeList = new CreateTradeList().getTradeList();

    private void attendesOptional() {
        List<Integer> attendes = Arrays.asList(22, 34,56 ,19);
        Optional<Integer> attendesOptional = attendes.stream().reduce(Integer::sum);

        System.out.println(attendesOptional.get());
    }

    private void noAttendesOptional() {
        List<Integer> attendes = Arrays.asList();
        Optional<Integer> noAttendesOptional = attendes.stream().reduce(Integer::sum);

        if (noAttendesOptional.isPresent())
            System.out.println(noAttendesOptional.get());
    }

    public static void main(String[] args) {
        OptionalStreams1 streams = new OptionalStreams1();
        streams.attendesOptional();
        streams.noAttendesOptional();
    }
}
