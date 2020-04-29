public class Switch {
    public static void main(String[] args) {

        // 1
        int index = 2;
        switch (index) {
            case 1:
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2");
                break;
            case 3:
                System.out.println("case 3");
                break;
            default:
                System.out.println("case others");
        }

        // 2

        index = 3;
        switch (index) {
            case 1 -> System.out.println("case 1");
            case 2 -> System.out.println("case 2");
            case 3 -> System.out.println("case 3");
            default -> System.out.println("case default");
        }

        // 3

        System.out.println("Multiple case lable:");
        index = 811;
        switch (index) {
            case 1, 3, 5, 7, 9 -> System.out.println("odd case");
            case 2, 4, 6, 8, 10 -> System.out.println("even case");
            default -> {
                System.out.println("\tthis is the first line in default");
                System.out.println("\nthis is the second line in default");

            }
        }
    }
}
