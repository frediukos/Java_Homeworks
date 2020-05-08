package Inheritance;

public class TestQAEngineer {

    public static void main(String[] args) {
        var QAEngineer = new QAEngineer("Fred Frediukovich", 10000, "Apple", 10000);

        System.out.println("Name: " + QAEngineer.getName());
        System.out.println("Salary: " + QAEngineer.getSalary());
        System.out.println("Company: " + QAEngineer.getCompany());
        System.out.println("Sign in bonus: " + QAEngineer.getSignInBonus());
    }
}
