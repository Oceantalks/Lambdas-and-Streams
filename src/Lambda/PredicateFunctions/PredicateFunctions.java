package Lambda.PredicateFunctions;

/**
 * Created by Ado on 2017-12-27.
 */
public class PredicateFunctions {

    Predicate<Employee> em = (emp) -> emp.getStatus(11)?true:false;
    Predicate<String> test = (s) -> s.isEmpty();

    public static void main(String[] args) {
        Predicate<Employee> em = (emp) -> emp.getStatus(11)?true:false;
        Predicate<String> test = (s) -> s.isEmpty();
    }


}
