package Task_3;

public class DVD extends Media {
    private String duration;

    public DVD(String title, String author, int year, String duration) {
        super(title, author, year);
        this.duration = duration;
    }

    @Override
    public void displayInfo() {
        System.out.println("DVD: " + title + " by " + author + " (" + year + "), Duration: " + duration);
    }
}
