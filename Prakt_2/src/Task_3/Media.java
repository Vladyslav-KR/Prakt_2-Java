package Task_3;

public abstract class Media {
    protected String title;
    protected String author;
    protected int year;

    public Media(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Абстрактний метод для виведення інформації про медіа
    public abstract void displayInfo();
}
