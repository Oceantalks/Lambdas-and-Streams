package Lambda.FunctionalInterfaces;

/**
 * Created by Ado on 2017-12-27.
 */
public class FunctionalInterfaceImpl {

    interface Cruncher {
        int crunch(int i, int j);
    }

    public int cruncherService(int i, int j, Cruncher cruncher){
        return cruncher.crunch(i, j);
    }

    public static void main(String[] args) {
        FunctionalInterfaceImpl client = new FunctionalInterfaceImpl();

        int value = 0;

        value = client.cruncherService(8, 8, (i, j) -> i*j);

        System.out.println(value);

        value = client.cruncherService(9,9, (i,j) -> i/j);

        System.out.println(value);
    }
}
