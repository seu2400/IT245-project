public class BinarySearch {


    public static Book binarySearch(Book[] books, String isbn) {

        int left = 0
        int right = books.length - 1;
        
    while (left <= right) {

        int middle = (left + right) / 2;
        int comparison = books[middle].getIsbn().compareTo(isbn);

        if (comparison == 0) {
            return books[middle];
}

        return null;
}

return null;
    }

}
