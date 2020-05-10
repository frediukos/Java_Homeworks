package GoodDog;

public class GoodDog {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        size = s;
    }

    void bark() {
        if (size > 60) {
            System.out.println("Gav! Gav!");
        } else if (size > 14) {
            System.out.println("Wow! Wow!");
        } else {
            System.out.println("Tyaf! Tyaf!");
        }
    }
}
