package PGO_12c.cw2;

import java.sql.Array;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;

public class Person {

    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private Address address;
    private Book book;

    public Person(String name, String surname, LocalDate dateOfBirth, Address address) {
        setName(name);
        setSurname(surname);
        setDateOfBirth(dateOfBirth);
        setAddress(address);
    }

    public Person(String name, String surname) {
        setName(name);
        setSurname(surname);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()) {
            throw new ValidationException("Name must not be empty");
        }
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if(surname == null || surname.isEmpty()) {
            throw new ValidationException("Surname must not be empty");
        }
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        if(dateOfBirth == null) {
            throw new ValidationException("Date of birth must not be empty");
        }
        this.dateOfBirth = dateOfBirth;
    }

    public Period getAge() {
        if(dateOfBirth == null) {
            return null;
        } else {
            return Period.between(dateOfBirth, LocalDate.now());
        }
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Book PublishBook(String name, Genre genre, Lang language, LocalDate publishDate, Person author) {
        ArrayList<Person> authors = new ArrayList<Person>();
        authors.add(this);
        Book newBook = new Book(name, genre, language, publishDate, authors);
        newBook.setPublishDate(publishDate);
        return newBook;
    }
}
