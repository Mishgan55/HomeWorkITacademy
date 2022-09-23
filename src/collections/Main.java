package collections;


import collections.util.Util;
import collections.util.UtilGenerate;
import collections.util.UtilPrint;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("TASK");//Assignment on collections, which was at the lecture

        long start = System.currentTimeMillis();

        ArrayList<Object> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }

        long startRemove = System.currentTimeMillis();

        arrayList.remove(500000);

        long finish = System.currentTimeMillis();
        long result = finish - start;
        long resultRemoveArrayList = startRemove - finish;

        System.out.println("It takes to remove for ArrayList " + resultRemoveArrayList + " ms");
        System.out.println("It takes for ArrayList " + result + " ms");


        long startLinkedList = System.currentTimeMillis();
        LinkedList<Object> objects = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            objects.add(i);

        }

        long startRemoveLinkedList = System.currentTimeMillis();

        objects.remove(500000);

        long finishLinkedList = System.currentTimeMillis();
        long resultLinkedList = finishLinkedList - startLinkedList;
        long resultRemoveLinkedList = startRemoveLinkedList - finishLinkedList;

        System.out.println("It takes for LinkedList " + resultLinkedList + " ms");
        System.out.println("It takes to remove for ArrayList " + resultRemoveLinkedList + " ms");


        System.out.println("TASK1");

        LinkedList<Book> linkedList = UtilGenerate.getLinkedList();
        UtilPrint.printLinkedList(linkedList);
        UtilPrint.deleteFromLinkedList(linkedList);
        UtilPrint.printLinkedList(linkedList);


        System.out.println("TASK2");

        HashSet<Book> hashSet = UtilGenerate.generateHashSet();

//        for (Book str : hashSet) {
//
//            boolean test = str.matches("^(?i:[AaEeIiOoUuYy]).*");
//
//            if (test) {
//                System.out.println(str);
//            }
//        }

        System.out.println("TASK3");

        List<Book> list = UtilGenerate.getList();
        Util.sorted(list, Util.getRandomBook());
        UtilPrint.printList(list);

        Util.sorted(list, Util.getRandomName());
        UtilPrint.printList(list);

        Util.sorted(list, Util.getRandomSurname());
        UtilPrint.printList(list);

        System.out.println("TASK4");

        TreeSet<Student> treeSet = UtilGenerate.generateTreeSet(21);
        UtilPrint.printTreeSet(treeSet);

        UtilPrint.deleteNotEven(treeSet);
        UtilPrint.printTreeSet(treeSet);

        System.out.println("TASK5");
        LinkedList<User> friends = UtilGenerate.getFriends(5);
        System.out.println(friends);


    }
}