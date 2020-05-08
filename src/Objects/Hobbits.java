package Objects;

public class Hobbits {
    String name;

    public static void main(String[] args) {

        Hobbits[] h = new Hobbits[3];
        int i = 0;

        while (i < 3) {
            h[i] = new Hobbits();
            h[i].name = "Bilbo";
            if (i == 1) {
                h[i].name = "Frodo";
            }
            if (i == 2) {
                h[i].name = "Sam";
            }
            System.out.print(h[i].name + " - ");
            System.out.println("the good hobbit's name");
            i++;
        }
    }
}
