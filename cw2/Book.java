package PGO_12c.cw2;

import java.time.LocalDate;
import java.time.Period;

public class Book {

    private Long ID;
    private String name;
    private Genre genre;
    private Lang language;
    private LocalDate publishDate;
    private int borrowCount;

    public Book(Long ID, String name, Genre genre, Lang language, LocalDate publishDate, int borrowCount) {
        setID(ID);
        setName(name);
        setGenre(genre);
        setLanguage(language);
        setPublishDate(publishDate);
        setBorrowCount(borrowCount);
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Lang getLanguage() {
        return language;
    }

    public void setLanguage(Lang language) {
        this.language = language;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public int getBorrowCount() {
        return borrowCount;
    }

    public void setBorrowCount(int borrowCount) {
        this.borrowCount = borrowCount;
    }

    public Period getAge() {
        if(publishDate == null) {
            return null;
        }
        return Period.between(publishDate, LocalDate.now());
    }
}