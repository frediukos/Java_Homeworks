class CangePlaces {
    public static void main(String[] args) {
        int a = 12;
        int b = 13;
        System.out.println("a was " + a + " and b was " + b);
        a = a + b - (b = a);
        System.out.println("a now " + a + " and b now " + b);
        b = a + b;
        a = b - a;
        b = b - a;
        System.out.println("a now " + a + " and b now " + b);
    }
}