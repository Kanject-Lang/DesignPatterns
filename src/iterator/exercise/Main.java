package iterator.exercise;

/**
 * @description: TODO
 * @author: Kanject
 */
public class Main {
    public static void main(String[] args) {
        int initSize = 4;
        BookShelf bookShelf = new BookShelf(initSize);
        System.out.println("BookShelf's initSize: " + initSize);
        bookShelf.appendBook(new Book("数据结构与算法"));
        bookShelf.appendBook(new Book("操作系统"));
        bookShelf.appendBook(new Book("计算机网络"));
        bookShelf.appendBook(new Book("数据库概论"));
        bookShelf.appendBook(new Book("设计模式"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
        System.out.println("BookShelf's Size: " + bookShelf.getLength());
    }
}
