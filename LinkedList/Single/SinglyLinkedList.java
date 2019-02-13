/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList.Single;

import LinkedList.Single.Node;

/**
 *
 * @author HP
 */

public class SinglyLinkedList {
    public static void main(String args[]){
        LinkedList list=new LinkedList();
        for(int i=1;i<=5;i++)
            list.insertEnd(i);
        list.traverse();
        list.alternatePrint();
        list.printMiddle();
        list.insertBegin(0);
        list.traverse();
        list.alternatePrint();
        list.printMiddle();
        list.insertIndex(3,11);
        list.traverse();
        list.reverseTraversal(list.head);
        System.out.println();
        list.deleteIndex(3);
        list.deleteBegin();
        list.deleteEnd();
        list.traverse();
    }
}

class LinkedList{
    Node head;
    int num=0;
    public void insertEnd(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            num++;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
            num++;
        }
    }
    public void insertBegin(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
        }
        else{
            Node temp=node;
            node.next=head;
            head=node;
        }
        num++;
    }
    public void insertIndex(int index,int data){
        Node node=new Node(data);
        if(index<=num||index>0){
            Node temp=head;
            if(index>1){
                for(int i=1;i<index-1;i++){
                    temp=temp.next;
                }
                node.next=temp.next;
                temp.next=node;
                num++;
            }
            else{
                insertBegin(data);
                num++;
            }
        }
        else{
            System.out.println("Invalid Position");
        }
    }
    public void traverse(){
        if(head==null){
            System.out.print("The List is Empty");
        }
        else{
            Node temp=head;
            while(true){
                System.out.print(temp.data+"->");
                if(temp.next==null){
                    break;
                }
                else{
                    temp=temp.next;
                }
            }
            System.out.println("null");
        }
    }
    public void reverseTraversal(Node node){
        if(node==null){
            return;
        }
        reverseTraversal(node.next);
        System.out.print(node.data+" ");
    }
    public void alternatePrint(){
        int i=1;
        Node node=head;
        if(head==null){
            System.out.print("The List is Empty");
        }
        else{
            Node temp=head;
            while(true){
                if(i%2==0)
                    System.out.print(temp.data+"->");
                if(temp.next==null){
                    break;
                }
                else{
                    temp=temp.next;
                    i++;
                }
            }
            System.out.println("null");
        }
    }
    public void printMiddle(){
        Node temp=head;
        for(int i=1;i<=num/2;i++){
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
    public void deleteBegin(){
        if(head==null){
            System.out.println("List is Empty");
        }
        else{
            head=head.next;
            num--;
        }
    }
    public void deleteEnd(){
        if(head==null){
            System.out.println("List is Empty");
        }
        else{
            Node temp=head;
            for(int i=1;i<num-1;i++){
                temp=temp.next;
            }
            temp.next=null;
            num--;
        }
    }
    public void deleteIndex(int index){
        if(index>num||index<=0){
            Node temp=head;
            for(int i=1;i<index-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            num--;
        }
        else{
            System.out.println("Invalid Index");
        }
    }
}