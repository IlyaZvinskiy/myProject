package Final_Project;

public class Book {
    private final  String author;
    private final String title;
    private final int numOfPages;

    Book(String author, String title, int numOfPages){
        this.author = author;
        this.title = title;
        this.numOfPages = numOfPages;
    }

    String getTitle(){
        return this.title;
    }

    String getAuthor(){
        return this.author;
    }

    int getNumOfPages(){
        return this.numOfPages;
    }

}
