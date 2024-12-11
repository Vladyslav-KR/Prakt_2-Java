package Task_3;

public class Magazine extends Media {
    private String issue;

    public Magazine(String title, String author, int year, String issue) {
        super(title, author, year);
        this.issue = issue;
    }

    @Override
    public void displayInfo() {
        System.out.println("Magazine: " + title + " by " + author + " (" + year + "), Issue: " + issue);
    }
}
