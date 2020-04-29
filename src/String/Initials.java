package String;

public class Initials {
    public static void main(String[] args) {
        String name = "Astrid Lindgren";
        // 1
        String[] arr = name.split(" ");
        System.out.printf("%c%c", arr[0].charAt(0), arr[1].charAt(0));
        System.out.println();

        // 2
        System.out.printf("%c%c", name.charAt(0), name.charAt(name.indexOf(' ')+1));
    }
}

