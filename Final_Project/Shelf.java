package Final_Project;

import java.util.ArrayList;
import java.util.List;

public class Shelf {
    private final List<Book> books;
    private boolean isShelfFull;

    public Shelf(){
        this.books = new ArrayList<>();
        this.isShelfFull = false;
    }

    public void addBook(Book newBook) {
        if (books.size() < 5) {
            books.add(newBook);
            isShelfFull = false;
        } else {
            isShelfFull = true;
            System.out.println("No more space on the shelf to add the book: " + newBook.getTitle());
        }
    }

    void replaceBooks(int n1, int n2) {
        if (isPositionInvalid(n1) || isPositionInvalid(n2)) {
            System.out.println("Invalid book location(s) for replacement.");
        }
        Book temp = books.get(n1 - 1);
        books.set(n1 - 1, books.get(n2 - 1));
        books.set(n2 - 1, temp);
        System.out.println("Books at position " + (n1) + " and " + (n2) + " have been swapped.");
    }

    private boolean isPositionInvalid(int index){
        return index < 0 || index > books.size();
    }

    public boolean isShelfFull() {
        return isShelfFull;
    }

    public boolean deleteBook(String bookTitle){
        Book bookToRemove = null;
        for (Book book : books){
            if (book.getTitle().equals(bookTitle)){
                bookToRemove = book;
                break;
            }
        }
        if (bookToRemove != null){
            books.remove(bookToRemove);
            System.out.println("The book "+ bookTitle + " was deleted successfully" );
            return true;
        }
        return false;
    }

    List<String> searchByAuthor(String authorName){
        List<String> titlesByAuthor = new ArrayList<>();
        for (Book b: books){
            if (b.getAuthor().equals(authorName)){
                titlesByAuthor.add(b.getTitle());
            }else {
                System.out.println("There not is a book wrote by this author: " + authorName);
                break;
            }
        }
        return titlesByAuthor;
    }
}
