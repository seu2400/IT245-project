public class Main {

    public static void main(String[] args) {
        Book[] books = {
    new Book("1001", "Java Basics", "John Smith", "Programming", 2020),
    new Book("1002", "Data Structures", "Sara Ali", "Computer Science", 2021),
    new Book("1003", "Algorithms", "David Lee", "Computer Science", 2019),
    new Book("1004", "Database Systems", "Mona Ahmed", "Technology", 2022),
    new Book("1005", "Software Engineering", "Omar Hassan", "Engineering", 2023)
};
HashSearch hashSearch = new HashSearch();

for (Book book : books) {
    hashSearch.addBook(book);
}
        String targetIsbn = "1003";
long hashStart = System.nanoTime();
Book hashResult = hashSearch.searchByIsbn(targetIsbn);
long hashEnd = System.nanoTime();
System.out.println("HashMap Time: " + (hashEnd - hashStart) + " ns");
System.out.println("HashMap Search Result:");
System.out.println(hashResult);
        Book binaryResult = BinarySearch.binarySearch(books, targetIsbn);

System.out.println("Binary Search Result:");
System.out.println(binaryResult);
    }

}
