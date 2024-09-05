package Final_Project;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Shelf> shelves;
    private final List<Reader> readers;

    Library() {
        this.shelves = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            shelves.add(new Shelf());
        }
        this.readers = new ArrayList<>();
    }


    boolean isTherePlaceForNewBook() {
        for (Shelf s : shelves) {
            if (!s.isShelfFull()) {
                return true;
            }
        }
        return false;
    }

    void addNewBook(Book newBook) {
        for (Shelf s : shelves) {
            if (!s.isShelfFull()) {
                s.addBook(newBook);
            }
        }
    }

    void deleteBook(String bookTitle) {
        for (Shelf s : shelves) {
            if (s.deleteBook(bookTitle)) {
                break;
            }
            if (!s.deleteBook(bookTitle)) {
                System.out.println("There is no book title like this: " + bookTitle);
                break;
            }
        }
    }

    void registerReader(String name, int id) {
        readers.add(new Reader(id, name));
        System.out.println("The reader "+ name + " was registered successfully" );
    }

    public boolean deleteReader(String nameOfReader) {
        Reader readerToRemove = null;
        for (Reader reader : readers) {
            if (reader.getName().equals(nameOfReader)) {
                readerToRemove = reader;
                break;
            }else {
                System.out.println("There is no readers name like this: " + nameOfReader);
            }
        }
        if (readerToRemove != null) {
            readers.remove(readerToRemove);
            return true;
        }else {
            System.out.println("The readers name "+ nameOfReader + " was deleted successfully" );
        }
        return false;
    }

    List<String> searchByAuthor(String authorName) {
        List<String> booksByAuthor = new ArrayList<>();
        for (Shelf s : shelves) {
            booksByAuthor.addAll(s.searchByAuthor(authorName));
            System.out.println(booksByAuthor);
            break;
        }
        return booksByAuthor;
    }

}
