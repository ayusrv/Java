package com.LinkedList;

public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertFirst(5);
//        list.insertFirst(6);
//        list.insertFirst(7);
//        list.insertFirst(8);
//        list.insertLast(20);
//        list.insertLast(30);
//        list.insertLast(40);
//        list.insert(50,4);
//        list.print();
//        System.out.println(list.deleteFirst());
//        list.print();
//        System.out.println(list.deleteLast());
//        list.print();
//        System.out.println(list.delete(3));
//        list.print();

        DLL list = new DLL();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);
        list.insertLast(50);
        list.insert(60,4);
        list.print();
        list.printRev();
    }
}
