import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookDAO bookDAO = new BookDAO();
        IssueDAO issueDAO = new IssueDAO();

        while (true) {
            System.out.println("1. Add Book");
            System.out.println("2. Update Book");
            System.out.println("3. Delete Book");
            System.out.println("4. View All Books");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter title: ");
                        String title = scanner.next();
                        System.out.print("Enter author: ");
                        String author = scanner.next();
                        System.out.print("Enter quantity: ");
                        int quantity = scanner.nextInt();
                        bookDAO.addBook(title, author, quantity);
                        break;
                    case 2:
                        System.out.print("Enter book ID: ");
                        int id = scanner.nextInt();
                        System.out.print("Enter new title: ");
                        title = scanner.next();
                        System.out.print("Enter new author: ");
                        author = scanner.next();
                        System.out.print("Enter new quantity: ");
                        quantity = scanner.nextInt();
                        bookDAO.updateBook(id, title, author, quantity);
                        break;
                    case 3:
                        System.out.print("Enter book ID: ");
                        id = scanner.nextInt();
                        bookDAO.deleteBook(id);
                        break;
                    case 4:
                        bookDAO.getAllBooks().forEach(System.out::println);
                        break;
                    case 5:
                        System.out.print("Enter book ID: ");
                        id = scanner.nextInt();
                        System.out.print("Enter issued to: ");
                        String issuedTo = scanner.next();
                        issueDAO.issueBook(id, issuedTo);
                        break;
                    case 6:
                        System.out.print("Enter issue ID: ");
                        id = scanner.nextInt();
                        issueDAO.returnBook(id);
                        break;
                    case 7:
                        System.out.println("Exiting...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

