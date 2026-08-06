public class Book {
  
  private String isbn;
  private String title;
  private String author;
  private String genre;
  private int publicationYear;

 public Book(String isbn, String title, String author,
            String genre, int publicationYear) {

    this.isbn = isbn;
    this.title = title;
    this.author = author;
    this.genre = genre;
    this.publicationYear = publicationYear;
} 
  public String getIsbn() {
    return isbn;
}

public String getTitle() {
    return title;
}

public String getAuthor() {
    return author;
}

public String getGenre() {
    return genre;
}

public int getPublicationYear() {
    return publicationYear;
}
 @Override
public String toString() {
    return "ISBN: " + isbn +
            "\nTitle: " + title +
            "\nAuthor: " + author +
            "\nGenre: " + genre +
            "\nPublication Year: " + publicationYear;
}

  
}
