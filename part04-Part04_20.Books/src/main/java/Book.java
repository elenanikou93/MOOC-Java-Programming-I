public class Book {
    private String title;
    private int pages;
    private int year;

    public Book(String bookTitle, int pagesNum, int publishYear) {
        this.title = bookTitle;
        this.pages = pagesNum;
        this.year = publishYear;
    }

    public String getBookTitle() {
        return title;
    }

    public int getPagesNumber() {
        return pages;
    }

    public int yearOfPublication() {
        return year;
    }

    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.year;
    }

    

}
