package Management;

import Staff.Employee;

public class Manager extends Employee {

    String deptName;

    public Manager(String name, String niNumber, int salary, String deptName){
        super(name, niNumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName(){
        return this.deptName;
    }

    public void setDeptName(String deptName){
        this.deptName = deptName;
    }

}
