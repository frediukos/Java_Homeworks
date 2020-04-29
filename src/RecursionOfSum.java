public class RecursionOfSum {
    public int recursion(int n) {
        if (n == 1)
            return 1;
        else
            return n + recursion(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        RecursionOfSum r = new RecursionOfSum();
        System.out.print(r.recursion(n));
    }

}
