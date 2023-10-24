package domain;

import java.util.Objects;

public class Book {

    private static Long incrementId = 1L;
    private Long id;
    private String title;
    private Integer chapters;

    public Book(String title, Integer chapters) {
        this.id = incrementId++;
        this.title = title;
        this.chapters = chapters;
    }

    public String getTitle() {
        return title;
    }

    public Integer getChapters() {
        return chapters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(chapters, book.chapters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, chapters);
    }

    @Override
    public String toString() {
        return id + "; " + title + "; " + chapters + ";";
    }
}
