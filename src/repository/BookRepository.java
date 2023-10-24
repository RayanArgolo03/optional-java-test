package repository;

import domain.Book;
import services.BookProviderService;

import java.util.Optional;
import java.util.function.Predicate;

public class BookRepository implements Repository<Book> {

    @Override
    public Optional<Book> findByPredicate(Predicate<Book> predicate) {
        return BookProviderService.getFirstList().stream()
                .filter(predicate)
                .findFirst();
    }

    public Optional<Book> findByTitle(String title) {
        return findByPredicate(book -> book.getTitle().equals(title));
    }

    public Optional<Book> findByChapters(Integer chapters) {
        return findByPredicate(book -> book.getChapters().equals(chapters));
    }

}
