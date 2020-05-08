package Objects;

public class Books {

    String title;
    String author;
}

class BookTestDrive {

    public static void main(String[] args) {

        Books[] myBooks = new Books[3];

        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        int i = 0;
        myBooks[0].title = "Java fruits";
        myBooks[1].title = "Java Gatsby";
        myBooks[2].title = "Java recipe";

        myBooks[0].author = "Bob";
        myBooks[1].author = "Syu";
        myBooks[2].author = "Yan";

        while (i < 3) {
            System.out.print(myBooks[i].title);
            System.out.print(", author ");
            System.out.println(myBooks[i].author);
            i++;

        }
    }
}