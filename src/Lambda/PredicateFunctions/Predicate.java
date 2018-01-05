package Lambda.PredicateFunctions;

/**
 * Created by Ado on 2017-12-27.
 */

@FunctionalInterface
public interface Predicate<T> {

    // single abstract method
    boolean trueOrFalse(T t);
}
