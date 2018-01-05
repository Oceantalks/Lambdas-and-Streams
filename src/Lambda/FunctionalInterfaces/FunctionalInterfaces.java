package Lambda.FunctionalInterfaces;

/**
 * Created by Ado on 2017-12-27.
 */
public class FunctionalInterfaces {

    /** The condition to be able to assign an Lmabda expression to a Functional interface is to only write one abstract method in the
     * functional interface. And to make sure it stays that way we can annotate it with @FunctionalInterface
     */
    // A Functional Interface
    @FunctionalInterface
    interface Multiplier {
        int multiply(int i, int j);
    }

    // A Lambda Expression being assigend to a Functional Interface
    Multiplier multiplier = (i,j) -> i*j;

    public static void main(String[] args) {
        FunctionalInterfaces fi = new FunctionalInterfaces();
    }

}
