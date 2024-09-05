package Final_Project;

public class Menu {

    public static int receiveOption() {
        System.out.println("For adding a book - Press 1");
        System.out.println("For deleting a book - Press 2");
        System.out.println("For registering a new reader - Press 3");
        System.out.println("For removing a reader - Press 4");
        System.out.println("For searching books by author – Press 5");
        System.out.println("For exit – Press 6");
        return UserInterface.receiveInt("option");
    }

    public static Book receiveBook() {
        String title = UserInterface.receiveStr("book title");
        String author = UserInterface.receiveStr("book author");
        int numOfPages = UserInterface.receiveInt("book number of pages");
        return new Book(author, title, numOfPages);

    }

    public static String receiveTitleToDelete() {
        return UserInterface.receiveStr(" book title to remove");
    }

    public static String readerToAdd() {
        return UserInterface.receiveStr(" name of reader to add");
    }

    public static String readerToRemove() {
        return UserInterface.receiveStr(" name of reader to remove");
    }

    public static String authorName() {
        return UserInterface.receiveStr(" name of author to print all author's books titles");
    }
}
