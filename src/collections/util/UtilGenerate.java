package collections.util;

import collections.Book;
import collections.Student;
import collections.User;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

//collection generator
public class UtilGenerate {
    public static LinkedList<Book> getLinkedList() {
        LinkedList<Book> linkedList = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            Book book = new Book();
            linkedList.add(book);
        }
        return linkedList;
    }

    public static List<Book> getList() {
        List<Book> list = new LinkedList<>();
        for (int i = 0; i < 25; i++) {
            Book book = new Book();
            list.add(book);
        }
        return list;
    }

    public static HashSet<Book> generateHashSet() {
        HashSet<Book> hashSet = new HashSet<>();
        for (int i = 0; i < 19; i++) {
            Book book = new Book();
            hashSet.add(book);
        }
        for (int i = 0; i < 6; i++) {
            Book book = new Book("game ", "jon", "snow");
            hashSet.add(book);
        }
        return hashSet;
    }

    public static TreeSet<Student> generateTreeSet(int count) {
        TreeSet<Student> treeSet = new TreeSet<>();
        for (int i = 0; i < count; i++) {

            treeSet.add(new Student(i, Util.getRandomUser()));

        }
        return treeSet;
    }

    //    generates a random string using the added library
    public static String generateRandomString() {
        String generatedString = RandomStringUtils.randomAlphabetic(10);

        return generatedString;
    }

    public static LinkedList<User> getFriendsList() {
        LinkedList<User> users = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            User user = new User();
            users.add(user);

        }
        return users;
    }

    //outputting a collection using recursion
    public static LinkedList<User> getFriends(long depth) {// I don't understand what's going wrong

        LinkedList<User> users = new LinkedList<>();


        if (depth != 0) {

            for (long i = 0; i < depth; i++) {


                users.add(new User(Util.getRandomUser(), getFriends(depth - 1)));
            }

            return users;

        } else {

            return getFriends(depth - 1);

        }


    }
}


