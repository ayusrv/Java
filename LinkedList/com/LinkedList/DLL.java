package com.LinkedList;

public class DLL {

    Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head!=null)
            head.prev = node;
        head = node;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if(last==null){
            last = node;
            last.prev = null;
            return;
        }
        while(last.next!=null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    public void insert(int val, int ind){
        Node node = new Node(val);
        Node temp = head;
        if(ind==0) insertFirst(val);
        try {
            for (int i = 1; i < ind - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
            node.prev = node.next.prev;
            node.next.prev = node;
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public void print(){
        Node node = head;
        while(node!=null){
            System.out.print(node.val+" -> ");
            node = node.next;
        }
        System.out.println("END");
    }

    public void printRev(){
        Node node = head;
        Node temp = null;
        while(node!=null){
            temp = node;
            node = node.next;
        }
        while (temp!=null){
            System.out.print(temp.val+" -> ");
            temp = temp.prev;
        }
        System.out.println("START");
    }
    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
