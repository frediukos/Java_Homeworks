package Inheritance;

public class Employee extends Person {
    private double salary;
    private String company;

    public Employee(String aName, double aSalary, String aCompany) {
        super(aName);
        salary = aSalary;
        company = aCompany;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}

