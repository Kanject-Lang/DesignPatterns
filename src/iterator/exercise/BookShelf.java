package iterator.exercise;

import java.util.ArrayList;

/**
 * @description: TODO
 * @author: Kanject
 */
public class BookShelf implements Aggregate {

    private ArrayList<Book> books;

    private int last = 0;

    public BookShelf(int initSize) {
        this.books = new ArrayList<>(initSize);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        books.add(last, book);
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
