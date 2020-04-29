public class Factorial {

    public int factorial(int n) {
        if (n == 1)
            return 1;
        else
            return (n * factorial(n - 1));
    }
    public static void main(String[] args) {
        int n = 4;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial " + n + " = " + fact);

        Factorial f = new Factorial();
        System.out.println(f.factorial(n));
    }
}
