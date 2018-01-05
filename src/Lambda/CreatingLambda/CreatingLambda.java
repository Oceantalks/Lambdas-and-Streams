package Lambda.CreatingLambda;

/**
 * Creating Lambda
 *
 * Created by Ado on 2017-12-27.
 */
public class CreatingLambda {

    interface Greeting{
        public String sayHello(String g);
    }

    public void testGreeting(String a, Greeting g) {
        String result = g.sayHello(a);

        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {

        // input -> body
        // (String s) -> "Hello, " + s;

        new CreatingLambda().testGreeting("Adonai", (String s) -> "Hello, " + s);
        new CreatingLambda().testGreeting("Tanya" , (String s) -> "Hello, " + s);
        new CreatingLambda().testGreeting("Tanya" , (String s) -> !s.isEmpty()? "Hello, " + s : "Did you miss the name maybe?");

    }

}
