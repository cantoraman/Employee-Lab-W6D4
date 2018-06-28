package Staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private int salary;

    public Employee(String name, String niNumber, int salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public String getNiNumber(){
        return this.niNumber;
    }

    public int getSalary(){
        return this.salary;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setNiNumber(String niNumber){
        this.niNumber = niNumber;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public void raiseSalary(int increment){
        salary += increment;
    }

    public int payBonus(){
        return salary/100;
    }
}
