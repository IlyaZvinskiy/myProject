package Final_Project;

import java.util.ArrayList;
import java.util.List;

public class Reader {
    private static int idCounter = 0;
    private final int id;
    private final String name;
    private final List<String> books;

    Reader(int id, String name){
        this.id = id;
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void readBook(String bookTitle) {
        if (!this.books.contains(bookTitle)){
            this.books.add(bookTitle);
            System.out.println(name + " has read the book: " + bookTitle);
        }else {
            System.out.println(name + " has already read the book: " + bookTitle);
        }
    }

    public static int generateId(){
        return idCounter++;
    }
    String getName(){
        return this.name;
    }
}
