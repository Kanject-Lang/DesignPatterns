package iterator.example;

/**
 * @description: TODO
 * @author: Kanject
 */
public class BookShelfIterator implements Iterator {

    private BookShelf bookShelf;

    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    /** 判断书架中是否有下一本书 */
    @Override
    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    /** 返回迭代器当前所指向的书，并让迭代器指向下一本书 */
    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
