import java.util.ArrayList;
import java.util.List;

public class Libary {
    private static List<Book> books = new ArrayList<>();
    private static List<User> users = new ArrayList<>();

    public Libary() {
    }

    public static void addbook(Book book) {
        books.add(book);
        System.out.println("Book added successfully: " + book.getBname());
    }

    // Add a new user
    public static void addUser(User user) {
        users.add(user);
        System.out.println("User added successfully: " + user.getUname());
    }

    // Issue a book to a user
    public static void issueBook(int bookId, int userId) {
        Book book = findBookById(bookId);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }
        if (book.isIssued()) {
            System.out.println("Book is already issued.");
            return;
        }

        User user = findUserById(userId);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        book.setIssued(true);
        System.out.println("Book '" + book.getBname() + "' issued to " + user.getUname());
    }

    // Return a book
    public static void returnBook(int bookId) {
        Book book = findBookById(bookId);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }
        if (!book.isIssued()) {
            System.out.println("Book is not currently issued.");
            return;
        }

        book.setIssued(false);
        System.out.println("Book '" + book.getBname() + "' returned successfully.");
    }

    // Show all available (not issued) books
    public static void showAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (!book.isIssued()) {
                System.out.println(book);
            }
        }
    }

    // Find book by ID
    private static Book findBookById(int id) {
        for (Book book : books) {
            if (book.getBid() == id) return book;
        }
        return null;
    }

    // Find user by ID
    private static User findUserById(int id) {
        for (User user : users) {
            if (user.getUid() == id) return user;
        }
        return null;
    }
}
