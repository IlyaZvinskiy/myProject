package Final_Project;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("1", "qwe", 345);
        Book book2 = new Book("1", "asd", 245);
        Book book3 = new Book("rfv", "zxc", 145);
        Book book4 = new Book("tgb", "qaz", 445);
        Book book5 = new Book("abc", "abc", 245);
        Book book6 = new Book("efg", "efg", 545);
        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        Shelf shelf1 = new Shelf();
        Shelf shelf2 = new Shelf();
        Shelf shelf3 = new Shelf();
        shelf1.addBook(book1);
        shelf1.addBook(book2);
        shelf2.addBook(book3);
        shelf2.addBook(book4);
        shelf3.addBook(book5);
        shelf3.addBook(book6);
        Reader reader = new Reader(123412, "ilya");

        int option = Menu.receiveOption();
        while (option != 6) {
            try {
                switch (option) {
                    case 1:
                        Book book = Menu.receiveBook();
                        library.addNewBook(book);
                        break;
                    case 2:
                        library.deleteBook(Menu.receiveTitleToDelete());
                        break;
                    case 3:
                        library.registerReader(Menu.readerToAdd(), Reader.generateId());
                        break;
                    case 4:
                        library.deleteReader(Menu.readerToRemove());
                        break;
                    case 5:
                        library.searchByAuthor(Menu.authorName());
                        break;
                }
            }catch (Exception e){
                System.out.println("Error occurred returning to main menu");
            }
            option = Menu.receiveOption();
        }
    }

}
