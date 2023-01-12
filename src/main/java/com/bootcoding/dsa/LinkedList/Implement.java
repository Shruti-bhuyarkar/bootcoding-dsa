package com.bootcoding.dsa.LinkedList;

import org.w3c.dom.Node;

public class Implement {
    int data;
    Implement next;

    public Implement(int data) {
        this.data = data;
        this.next = null;
    }



    public static Implement create(){
        Implement firstNode = new Implement(10);
        Implement secondNode = new Implement(20);
        Implement thirdNode = new Implement(30);
        Implement forthNode = new Implement(40);

        Implement head = firstNode;
        head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;
        forthNode.next = null;
        return head;
    }
   //print
    public static void print(Implement head){
        Implement temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        print(create());
        create();
    }

}
