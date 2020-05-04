public class SecondMinNumber {
    public static void main(String[] args) {
        int[] num = {5, -1, 9, 22, 6, 5};
        int min = num[0];
        int min2 = num[0];
        for(int i = 0; i < num.length; i++) {
            if(min > num[i]) min = num[i];
            if(min2 > num[i] && num[i] != min) min2 = num[i];
        }
        System.out.println(min2);
    }
}
