/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
import java.util.ArrayList;

public class Author extends Person {
    private ArrayList<String> books;

    public Author(String firstName, String lastName) {
        super(firstName, lastName);
        books = new ArrayList<>();
    }

    /**
     * @deprecated Use publishedBooks instead
     */
    @Deprecated
    public ArrayList<String> getBooks() {
        return books;
    }

    public ArrayList<String> publishedBooks() {
        return books;
    }

    public void addBook(String book) {
        books.add(book);
    }

    public String sortName() {
        return String.format("%s, %s", lastName, firstName);
    }
}
