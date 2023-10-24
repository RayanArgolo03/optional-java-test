package services;

import domain.Book;

import java.util.List;
public class BookProviderService {
    public static List<Book> getFirstList() {
        return List.of(
                new Book("The Prince of Maquiavel", 222),
                new Book("Mitology", 234),
                new Book("Fedon", 120),
                new Book("Emotional Intelligence", 292),
                new Book("Ansient of Augusto Cury", 234),
                new Book("Fbi Persuasion Manual", 120)
        );
    }

}
