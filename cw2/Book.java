package PGO_12c.cw2;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Book {

    private Long ID;
    private String name;
    private Genre genre;
    private Lang language;
    private LocalDate publishDate;
    private int borrowCount;
    private boolean isAvailable = true;
    private String personBorrowing;

    public Book(Long ID, String name, Genre genre, Lang language, LocalDate publishDate, int borrowCount, boolean isAvailable) {
        setID(ID);
        setName(name);
        setGenre(genre);
        setLanguage(language);
        setPublishDate(publishDate);
        setBorrowCount(borrowCount);
        setIsAvailable(isAvailable);
    }

    public Book(String name, Genre genre, Lang language, LocalDate publishDate, ArrayList<Person> authors) {
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

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getPersonBorrowing() {
        return this.personBorrowing;
    }

    public Period getAge() {
        if(publishDate == null) {
            return null;
        }
        return Period.between(publishDate, LocalDate.now());
    }

    public void BorrowBook(Person borrowing) {
        if(isAvailable == false) {
            throw new RuntimeException("This book is already borrowed");
        } else {
            if(personBorrowing.isEmpty()) {
                borrowCount++;
                isAvailable = false;
                personBorrowing = borrowing.getName();
                System.out.println(borrowing.getName() + " just borrowed this book.");
            } else {
                throw new RuntimeException("You cannot borrow any more books.");
            }
        }
    }

    public void PlaceBack() {
        this.isAvailable = true;
        System.out.println(getName() + " is no longer borrowed by anyone.");
        personBorrowing = null;
    }
}