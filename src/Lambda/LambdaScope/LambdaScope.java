package Lambda.LambdaScope;

/**
 * Created by Ado on 2017-12-27.
 *
 * Examples that shows that the same scope applies to Lambda as well
 */
public class LambdaScope extends SuperScope {

    private String member = "GRANDPA";

    interface Family {
        String who(String member);
    }

    public void testMember(String member) {
        System.out.println("Local member: " + member);
        System.out.println("Local member: " + this.member);
        System.out.println("Local member: " + super.member);

        Family familyLambda = (familyMember) -> {
            System.out.println("Local familyMember: " + familyMember);
            System.out.println("Local member: " + member);
            System.out.println("Local this.member: " + this.member);
            System.out.println("Local super.member: " + super.member);
            return familyMember;
        };

        familyLambda.who(member);
    }

    public static void main(String[] args) {
        new LambdaScope().testMember("SON");
    }

}
