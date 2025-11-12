import java.util.*;

class Publisher {
    String publisherName;
    int publisherId;

    void getData(Scanner sc) {
        System.out.println("Enter Publisher name: ");
        publisherName = sc.nextLine();
        System.out.println("Enter Publisher ID: ");
        publisherId = sc.nextInt();
        sc.nextLine();
    }
    void showData() {
        System.out.println("\nPublisher Details:");
        System.out.println("Publisher Name: " + publisherName);
        System.out.println("Publisher ID: " + publisherId);
    }
}

class Book extends Publisher {
    String bookTitle;
    int bookId;
    String authorName;

    void getData(Scanner sc) {
        super.getData(sc);
        System.out.println("Enter Book Title: ");
        bookTitle = sc.nextLine();
        System.out.println("Enter Book ID: ");
        bookId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Author Name: ");
        authorName = sc.nextLine();
    }
    void showData() {
        super.showData();
        System.out.println("\nBook Details:");
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Book ID: " + bookId);
        System.out.println("Author Name: " + authorName);
    }
}

public class PublisherDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b = new Book();
        b.getData(sc);
        b.showData();
        sc.close();
    }
}