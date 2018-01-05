package Lambda.TargetType;

/**
 * Created by Ado on 2017-12-27.
 *
 * How does Lambda know which type to use?
 *
 * Exampel
 */
public class TargetType {

    private static final String domainName = "@gmail.com";

    public interface Email {
        String constructEmail(String name);
    }

    Email email = (String name) -> name + domainName;

    public String getEmail(String name, Email email){
        return null;
    }

    public static void main(String[] args) {
        // The Lambda expression is recogized as an Type of Email
        new TargetType().getEmail("adonai", (String name) -> name + domainName);
    }

}
