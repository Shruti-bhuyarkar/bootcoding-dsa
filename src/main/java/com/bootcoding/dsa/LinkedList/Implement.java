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
    //Inserting first node in list
    public static Implement firstInsert(Implement head)
    {
        Implement imp = new Implement(70);
        imp.next=head;
        head=imp;
        return head;
    }
    //Inserting last node in list
    public static void lastInsertNode(Implement head)
    {
        Implement temp = head;
        Implement imp = new Implement(50);
        System.out.println(head);
        while (temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = imp;
    }
    //Deleting first node in list
    public static void deleteFirstNode(Implement head)
    {
        head = head.next;
        print(head);
    }
    //deleting last node in list
    public static void deleteLastNode(Implement head)
    {
        Implement temp = head;
        while (temp != null)
        {
            System.out.println(temp.data);
            if (temp.next.next == null)
            {
                temp.next = null;
            }
            temp = temp.next;
        }
    }



    public static void main(String[] args) {

        print(create());
       // create();

    }

}
