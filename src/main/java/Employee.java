public class Employee {

    private String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, double salary){
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

    public double getSalary(){
        return this.salary;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setNiNumber(String niNumber){
        this.niNumber = niNumber;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void raiseSalary(double increment){
        salary += increment;
    }

    public double payBonus(){
        return 0.01 * salary;
    }
}
