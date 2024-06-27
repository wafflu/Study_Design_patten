package p1_iterator;

import java.util.Iterator;

public class main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("java book"));
        bookShelf.appendBook(new Book("C++ book"));
        bookShelf.appendBook(new Book("Design patten book"));
        bookShelf.appendBook(new Book("JavaScript book"));

        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()){
            Book book = it.next();
            System.out.println(book.getName());
        }

        System.out.println();

        //확장 for문
        for(Book book : bookShelf){
            System.out.println(book.getName());
        }
    }
}
