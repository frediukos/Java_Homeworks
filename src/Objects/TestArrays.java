package Objects;

public class TestArrays {

    public static void main(String[] args) {
        String[] island = new String[4];
        int[] index = new int[4];

        island[0] = "Bermudas";
        island[1] = "Fiji";
        island[2] = "Azores";
        island[3] = "Cozumel";

        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        int i = 0;
        int ref;
        while (i < 4) {
            ref = index[i];
            System.out.print("islands = ");
            System.out.println(island[ref]);
            i++;
        }

    }
}
