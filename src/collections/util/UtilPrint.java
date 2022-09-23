package collections.util;

import collections.Book;
import collections.Student;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

//methods for displaying collections and deleting collection elements
public class UtilPrint {
    public static void printHashSet(HashSet<Book> hashSet) {
        System.out.println(hashSet);

            //  don't work     the method should display words starting with a vowel


    }

    public static void printList(List<Book> list) {

        System.out.println(list);
    }

    public static void printLinkedList(LinkedList<Book> linkedList) {

        System.out.println(linkedList);
    }

    public static void printTreeSet(TreeSet<Student> treeSet) {

        System.out.println(treeSet);
    }
    //collection removal methods
    public static void deleteFromLinkedList(LinkedList<Book> linkedList) {

        linkedList.remove(7);
    }

    public static void deleteNotEven(TreeSet<Student> treeSet) {
        int size = treeSet.size();
        for (int i = 0; i < size; i++) {
            if (i % 2 != 0) {
                treeSet.remove(new Student(i, Util.getRandomUser()));
            }

        }
    }
}
