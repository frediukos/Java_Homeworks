package String;

public class ReverseString {
    public static void main(String[] args) {
        String str = "I love Java!";

        // 1
        StringBuffer alphabet = new StringBuffer("abcdefghijklmnopqrstuvwxyz");
        System.out.print("ver1 " + alphabet + " => ");
        System.out.println(alphabet.reverse());

        // 2
        char[] arr = str.toCharArray();
        System.out.print("ver2 " + str + " => ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
        System.out.println();

        // 3
        System.out.print("ver3 " + str + " => ");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(str.length() - 1 - i));
        }
        System.out.println();

        // 4
        System.out.print("ver4 " + str + " => ");
        String reverse = "";
        String[] array = str.split(" ");
        for (String word: array) {
            reverse = word + " " + reverse;
        }
        System.out.println(reverse);


    }
}
