package concurrent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Semaphore;


public class SomeExperience {
    //    public static List<String> strings=Collections.synchronizedList(new ArrayList<>());
//
//    public static void main(String[] args) {
//        new Operator().start();
//        new Machine().start();
//
//    }
//
//    static class Operator extends Thread{
//        @Override
//        public void run() {
//            Scanner scanner = new Scanner(System.in);
//            while (true){
//
//                synchronized (strings){
//                    strings.add(scanner.nextLine());
//                    strings.notify();
//
//
//
//                }
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//
//    static class Machine extends Thread{
//        @Override
//        public void run() {
//            while (strings.isEmpty()){
//                synchronized (strings){
//                    try {
//                        strings.wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(strings.remove(0));
//                }
//            }
//
//
//        }
//    }
    public static void main(String[] args) {
        Semaphore table = new Semaphore(2);
        Person person = new Person();
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();

        person.table=table;
        person1.table=table;
        person2.table=table;
        person3.table=table;
        person4.table=table;

        person.start();
        person1.start();
        person2.start();
        person3.start();
        person4.start();


    }
}
class Person extends Thread{
    Semaphore table;

    @Override
    public void run() {
        try {

            table.acquire();
            System.out.println(getName()+"seat on the table");
            Thread.sleep(2000);
            System.out.println(getName()+"release table");
        table.release();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    }
}




