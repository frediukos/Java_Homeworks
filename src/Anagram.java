import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

//    String str1 = "Debit card";
//    String str2 = "Bad credit";


    public boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char[] chars1 = str1.toCharArray();
        Arrays.sort(chars1);
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);

    }

    public static void main(String[] args) {
        String str1 = "Debit card";
        String str2 = "Bad credit";

        Anagram anagram = new Anagram();
        System.out.println(anagram.isAnagram(str1, str2));

    }
}
