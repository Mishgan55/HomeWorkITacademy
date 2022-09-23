package collections.util;

import collections.Book;
import collections.Titles;

import java.util.Collections;
import java.util.List;

//returns a random name from the TITLES interface
public class Util implements Titles {

    public static String getRandomBook() {
        String[] books = TITLE;
        int x = (int) Math.floor(Math.random() * TITLE.length);
        return books[x];


    }

    public static String getRandomUser() {
        String[] user = USER;
        int x = (int) Math.floor(Math.random() * USER.length);
        return user[x];


    }
    public static String getRandomOfUser() {
        String[] author = {"Danil", "Alexei", "Nikita", "Slava", "Pushkin", "Lebedev", "Andrei"};
        int a = (int) Math.floor(Math.random() * author.length);
        return author[a];
    }


    public static String getRandomName() {
        String[] name = NAME;
        int x = (int) Math.floor(Math.random() * NAME.length);
        return name[x];


    }


    public static String getRandomSurname() {
        String[] surname = SURNAME;
        int x = (int) Math.floor(Math.random() * SURNAME.length);
        return surname[x];


    }

    //sorts by last name, first name and book title
    public static void sorted(List<Book> list, String value) {
        Book book = new Book();

        if (value == book.getTitle()) {
            Collections.sort(list, new Book.CompareTitle());
        }
        if (value == book.getName()) {
            Collections.sort(list, new Book.CompareName());
            if (value == book.getSurname()) {
                Collections.sort(list, new Book.CompareSurname());
            }


        }

    }

}
