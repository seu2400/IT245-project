import java.util.HashMap;
public class HashSearch {
private HashMap<String, Book> booksMap; 
  public HashSearch() {
    booksMap = new HashMap<>();
}
 public void addBook(Book book) {
    booksMap.put(book.getIsbn(), book);
} 
}
