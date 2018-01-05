package Lambda.MethodReferences;

/**
 * Created by Ado on 2017-12-27.
 *
 * Static method reference usage
 * Instance method reference usage
 *
 */

interface Movie{
    public boolean check(int i);
}

public class MethodReferences {

    // Static method reference usage
    public void testMovieStaticMethodRef(){
        Movie m1 = (i) -> i < 100?true:false;
        Movie m2 = MethodReferences::isClassic;
    }

    // Instance method reference usage
    private void testMovieInstanceMethodRef(){
        MethodReferences ref = new MethodReferences();
        Movie m1 = (i) -> i > 10 && i < 100?true:false;
        Movie m2 = ref::isTop10;
    }

    private void testArbitraryObjectMethod(){
        Movie m1 = SomeMethodReferences::isComedy;
    }


    public boolean isTop10(int movieId) {
        return true;
    }

    public static boolean isClassic(int movieId){
        return true;
    }

    public static void main(String[] args) {
        MethodReferences ref = new MethodReferences();
        ref.testMovieStaticMethodRef();
    }

}
class SomeMethodReferences {
    public static boolean isComedy(int i) {
        return false;
    }
}