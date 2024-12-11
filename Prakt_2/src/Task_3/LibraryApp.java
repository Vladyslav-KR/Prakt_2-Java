package Task_3;

import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library<Media> library = new Library<>();

        while (true) {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Add Magazine");
            System.out.println("3. Add DVD");
            System.out.println("4. Remove Media");
            System.out.println("5. Search Media by Title");
            System.out.println("6. Display All Media");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter book title: ");
                    String bookTitle = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String bookAuthor = scanner.nextLine();
                    System.out.print("Enter book year: ");
                    int bookYear = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter book genre: ");
                    String bookGenre = scanner.nextLine();
                    library.addMedia(new Book(bookTitle, bookAuthor, bookYear, bookGenre));
                    break;
                case 2:
                    System.out.print("Enter magazine title: ");
                    String magTitle = scanner.nextLine();
                    System.out.print("Enter magazine author: ");
                    String magAuthor = scanner.nextLine();
                    System.out.print("Enter magazine year: ");
                    int magYear = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter magazine issue: ");
                    String magIssue = scanner.nextLine();
                    library.addMedia(new Magazine(magTitle, magAuthor, magYear, magIssue));
                    break;
                case 3:
                    System.out.print("Enter DVD title: ");
                    String dvdTitle = scanner.nextLine();
                    System.out.print("Enter DVD author: ");
                    String dvdAuthor = scanner.nextLine();
                    System.out.print("Enter DVD year: ");
                    int dvdYear = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter DVD duration: ");
                    String dvdDuration = scanner.nextLine();
                    library.addMedia(new DVD(dvdTitle, dvdAuthor, dvdYear, dvdDuration));
                    break;
                case 4:
                    System.out.print("Enter title of the media to remove: ");
                    String removeTitle = scanner.nextLine();
                    library.searchMedia(removeTitle);  // Display info to confirm
                    // Implement removal logic here if required
                    break;
                case 5:
                    System.out.print("Enter title to search: ");
                    String searchTitle = scanner.nextLine();
                    library.searchMedia(searchTitle);
                    break;
                case 6:
                    library.displayAllMedia();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
