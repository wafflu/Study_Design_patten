package p1_iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class BookShelf implements Iterable<Book> {
    private ArrayList<Book> books = new ArrayList<>();

    public BookShelf(){}

    public Book getBookAt(int index){
        return books.get(index);
    }

    public void appendBook(Book book){
        books.add(book);
    }

    public int getLenght(){
        return books.size();
    }

    @Override
    public Iterator<Book> iterator(){
        return new BookShelfIterator(this);
    }
}
