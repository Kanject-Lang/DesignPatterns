package iterator.example;

/**
 * @description: TODO
 * @author: Kanject
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("数据结构与算法"));
        bookShelf.appendBook(new Book("操作系统"));
        bookShelf.appendBook(new Book("计算机网络"));
        bookShelf.appendBook(new Book("数据库概论"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
