package Task_3;

public class Book extends Media {
    private String genre;

    public Book(String title, String author, int year, String genre) {
        super(title, author, year);
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book: " + title + " by " + author + " (" + year + "), Genre: " + genre);
    }
}

