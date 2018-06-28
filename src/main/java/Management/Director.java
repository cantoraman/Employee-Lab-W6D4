package Management;
import Staff.Employee;
public class Director extends Employee {

    private int budget;

    public Director (String name, String niNumber, int salary, int budget){
        super(name, niNumber, salary);
        this.budget = budget;
    }

    public int getBudget(){
        return this.budget;
    }
}
