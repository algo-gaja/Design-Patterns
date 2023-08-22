package iterator.exam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelf implements Iterable<Book> {
	// 배열이 아닌 ArrayList 사용하기
	private List<Book> books;
	
	public BookShelf(int initialsize) {
		this.books = new ArrayList<>(initialsize);
	}
	
	public Book getBookAt(int index) {
		return books.get(index);
	}
	
	public void appendBook(Book book) {
		this.books.add(book);
	}
	
	public int getLength() {
		return books.size();
	}
	
	@Override
	public Iterator<Book> iterator() {
		return new BookShelfIterator(this);
	}
	
}
