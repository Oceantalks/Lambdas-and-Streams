package Lambda.IntroductionExamples;

import java.util.concurrent.Callable;

/**
 * Created by Ado on 2017-12-27.
 *
 * Example Lambdas
 */
public class Runnables {

    public void methodAcceptingRunnable(Runnable r){}

    public void methodAcceptingCallable(Callable c){}

    public static void main(String[] args) {

        // Runnable perfect candidate for Lambda extending only one abstract method

        Runnable runnable = () -> System.out.println("Hello, Lambda");

        new Runnables().methodAcceptingRunnable(runnable);

        new Runnables().methodAcceptingRunnable(() -> {
            System.out.println("Complex Lambdas");
            persist();
            email();
        });

        Callable callable = () -> "Hello, Callable";

        new Runnables().methodAcceptingCallable(() -> {
            return "Hello";
        });

    }

    private static void persist() {

    }

    private static void email() {

    }


}
