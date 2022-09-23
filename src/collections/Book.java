package collections;

import java.util.Comparator;
import java.util.Objects;

import static collections.util.Util.*;

public class Book implements Titles, Comparable<Book> {
    private String title;
    private String name;
    private String surname;


    public Book() {
        title = getRandomBook();
        name = getRandomName();
        surname = getRandomSurname();
    }

    public Book(String title, String name, String surname) {
        this.title = title;
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(name, book.name)
                && Objects.equals(surname, book.surname);
    }


    @Override
    public int hashCode() {
        return Objects.hash(title, name, surname);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book book) {
        return Comparator.comparing(Book::getTitle).thenComparing(Book::getName).
                thenComparing(Book::getSurname).compare(this, book);
    }


    public static class CompareTitle implements Comparator<Book> {

        @Override
        public int compare(Book o1, Book o2) {
            return o1.getTitle().compareTo(o2.getTitle());

        }
    }

    public static class CompareName implements Comparator<Book> {

        @Override
        public int compare(Book o1, Book o2) {
            return o1.getName().compareTo(o2.getName());

        }
    }

    public static class CompareSurname implements Comparator<Book> {

        @Override
        public int compare(Book o1, Book o2) {
            return o1.getSurname().compareTo(o2.getSurname());

        }
    }


}






