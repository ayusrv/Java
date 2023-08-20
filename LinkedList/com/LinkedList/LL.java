package com.LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size=0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail==null)
            tail = head;
        size+=1;
    }

    public void insertLast(int val){
        if(tail==null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = tail.next;
        size+=1;
    }

    public void insert(int val, int ind){
        try {
            if (ind == 0) {
                insertFirst(val);
                return;
            }
            if (ind == size) {
                insertLast(val);
                return;
            }
            Node temp = head;
            for (int i = 1; i < ind; i++) {
                temp = temp.next;
            }
            Node node = new Node(temp.next, val);
            temp.next = node;
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public int deleteFirst(){
        try{
            int val = head.val;
            head = head.next;
            if(head==null) tail=null;
            return val;
        }
        catch (Exception e){
            System.out.println(e);
        }
        size--;
        return -1;
    }

    public Node getNode(int ind){
        Node temp = head;
        for(int i=0;i<ind;i++){
            temp = temp.next;
        }
        return temp;
    }

    public int deleteLast(){
        int val = tail.val;
        if(size<=1) return deleteFirst();
        tail = getNode(size-2);
        tail.next = null;
        return val;
    }

    public int delete(int ind){
        Node node = getNode(ind-1);
        int val = node.next.val;
        node.next = node.next.next;
        return val;
    }

    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }

        public Node(Node node, int val){
            this.next = node;
            this.val = val;
        }

    }
}
