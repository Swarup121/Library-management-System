import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Driver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choose;
        System.out.println("Welcome To the Library Management System");
        do {
            System.out.println("Choose the Following option to proceed");
            System.out.println("Press 1 : Add a Book");
            System.out.println("Press 2 : Add a new User");
            System.out.println("Press 3 : Issue a Book");
            System.out.println("Press 4 : Return a Book");
            System.out.println("Press 5 : Show the Availablity of Book");
            System.out.println("Press 6 : Exit");
            choose = sc.nextInt();

            switch (choose)
            {
                case 1:
                    System.out.println("Enter the id of the Book");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the name of the Book");
                    String name= sc.nextLine();
                    System.out.println("Enter the author of the Book");
                    String aName = sc.nextLine();
                    Book book = new Book(id,name,aName);
                    Libary.addbook(book);
                    break;

                case 2:
                    System.out.print("Enter User ID: ");
                    int userId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter User Name: ");
                    String userName = sc.nextLine();
                    User user = new User(userId, userName);
                    Libary.addUser(user);
                    break;

                case 3:
                    System.out.print("Enter Book ID to issue: ");
                    int issueBookId = sc.nextInt();
                    System.out.print("Enter User ID to issue to: ");
                    int issueUserId = sc.nextInt();
                    Libary.issueBook(issueBookId, issueUserId);
                    break;

                case 4:
                    System.out.print("Enter Book ID to return: ");
                    int returnBookId = sc.nextInt();
                    Libary.returnBook(returnBookId);
                    break;

                case 5:
                    Libary.showAvailableBooks();
                    break;

                case 6:
                    System.out.println("Exiting Library System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }


        }
        while (choose<6 && choose>0);


    }
}