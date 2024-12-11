package Task_3;

import java.util.ArrayList;
import java.util.List;

public class Library<T extends Media> {
    private List<T> mediaCollection;

    public Library() {
        mediaCollection = new ArrayList<>();
    }

    public void addMedia(T media) {
        mediaCollection.add(media);
        System.out.println(media.getClass().getSimpleName() + " added to the library.");
    }

    public void removeMedia(T media) {
        if (mediaCollection.remove(media)) {
            System.out.println(media.getClass().getSimpleName() + " removed from the library.");
        } else {
            System.out.println("Media not found in the library.");
        }
    }

    public void searchMedia(String title) {
        for (T media : mediaCollection) {
            if (media.title.equalsIgnoreCase(title)) {
                media.displayInfo();
                return;
            }
        }
        System.out.println("Media with title " + title + " not found.");
    }

    public void displayAllMedia() {
        if (mediaCollection.isEmpty()) {
            System.out.println("No media in the library.");
            return;
        }
        for (T media : mediaCollection) {
            media.displayInfo();
        }
    }
}
