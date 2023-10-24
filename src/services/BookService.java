package services;

import domain.Book;
import enums.Option;
import repository.BookRepository;

import java.util.*;

public class BookService {
    private final BookRepository bookRepository;
    private final Scanner sc;

    public BookService() {
        this.bookRepository = new BookRepository();
        this.sc = new Scanner(System.in);
    }

    public Optional<Book> find(Option option) {
        return (option == Option.TITLE)
                ? bookRepository.findByTitle(getTitle())
                : bookRepository.findByChapters(getChapters());
    }

    private String getTitle() {
        System.out.print("Title: ");
        return sc.nextLine();
    }

    private int getChapters() {
        System.out.print("Chapters: ");
        return Integer.parseInt(sc.nextLine());
    }
}
