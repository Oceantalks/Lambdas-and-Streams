package Lambda.PredicateFunctions;

/**
 * Created by Ado on 2017-12-27.
 */
public class Employee {

    private int salary = 0;

    public boolean getStatus(int salary){
        this.salary = salary;
        if (salary >=10) {
            return true;
        } else {
            return false;
        }
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
