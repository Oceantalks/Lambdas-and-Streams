package CommonStreams.OptionalStreams;

import root.Trade;

import javax.naming.OperationNotSupportedException;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Optional;

/**
 * Created by Ado on 2018-01-04.
 */
public class OptionalStreams2 {

    private void createOptional() {
        Trade trade = new Trade();
        Optional<Trade> tradeOptional1 = Optional.of(trade);

        if (tradeOptional1.isPresent()) {
            System.out.println(tradeOptional1.get());
        }

        tradeOptional1.ifPresent(System.out::println);
        trade = null;
        Optional<Trade> tradeOptional2 = Optional.ofNullable(trade);
        System.out.println("Student can not be null: " + tradeOptional2);
    }

    private void ifElseOptionals() {
        Trade trade = null;
        Trade defaultTrade = new Trade();
        defaultTrade.setNameOfTrade("Default Trade");
        Optional<Trade> tradeOptional = Optional.ofNullable(trade);
        String name = tradeOptional.orElse(defaultTrade).getNameOfTrade();

    }

    private void ifElseThrowOptionals() throws Exception {
        Trade trade = null;
        Optional<Trade> tradeOptional = Optional.ofNullable(trade);
        tradeOptional.orElseThrow(Exception::new);
    }

    private void filterMapOptionals() {
        Trade trade = new Trade();
        trade.setNameOfTrade("Ripple");
        trade.setBigRisk(true);

        Optional<Trade> tradeOptional = Optional.of(trade);
        tradeOptional.filter(t -> t.isBigRisk())
                .ifPresent(System.out::println);
        tradeOptional.map(s -> s.getNameOfTrade())
                .ifPresent(System.out::println);
    }

    public static void main(String[] args) {
        OptionalStreams2 streams2 = new OptionalStreams2();
        streams2.createOptional();
        streams2.ifElseOptionals();

        try {
            streams2.ifElseThrowOptionals();
        } catch (Exception e ) {
            System.out.println("Expected exception: " + e);
        }
        streams2.filterMapOptionals();
    }
}
