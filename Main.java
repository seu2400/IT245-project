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
       long binaryStart = System.nanoTime();

Book binaryResult = BinarySearch.binarySearch(books, targetIsbn);

long binaryEnd = System.nanoTime();

System.out.println("Binary Search Result:");
System.out.println(binaryResult);
System.out.println("Binary Search Time: " + (binaryEnd - binaryStart) + " ns");
        String missingIsbn = "9999";

Book missingHashResult = hashSearch.searchByIsbn(missingIsbn);
Book missingBinaryResult = BinarySearch.binarySearch(books, missingIsbn);

System.out.println("Missing ISBN - HashMap Result: " + missingHashResult);
System.out.println("Missing ISBN - Binary Search Result: " + missingBinaryResult);
        Runtime runtime = Runtime.getRuntime();

long memoryBefore = runtime.totalMemory() - runtime.freeMemory();

hashSearch.searchByIsbn(targetIsbn);
BinarySearch.binarySearch(books, targetIsbn);

long memoryAfter = runtime.totalMemory() - runtime.freeMemory();

System.out.println("Approximate Memory Used: " + (memoryAfter - memoryBefore) + " bytes");
        long hashTime = hashEnd - hashStart;
long binaryTime = binaryEnd - binaryStart;

if (hashTime < binaryTime) {
    System.out.println("HashMap search was faster in this test.");
} else if (binaryTime < hashTime) {
    System.out.println("Binary Search was faster in this test.");
} else {
    System.out.println("Both searches took the same time in this test.");
}
    }

}
