package Inheritance;

public class QAEngineer extends Employee {

    private double signInBonus;

    public QAEngineer(String aName, double aSalary, String aCompany, double aSignInBonus) {
        super( aName, aCompany, aSalary);
        signInBonus = aSignInBonus;
    }

    public double getSignInBonus() {
        return signInBonus;
    }

}
