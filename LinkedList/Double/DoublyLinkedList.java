/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList.Double;



/**
 *
 * @author HP
 */
public class DoublyLinkedList {
    public static void main(String args[]){
        LinkedLists2x list=new LinkedLists2x();
        for(int i=1;i<=5;i++){
            list.insertEnd(i);
        }
        list.insertBegin(0);
        list.traverse();
        list.traverseReverse();
        list.deleteEnd();
        list.deleteFront();
        list.traverse();
    }
}

class LinkedLists2x{
    DoubleNode head;
    DoubleNode tail;
    int count=0;
    public void traverse(){
        if(head==null){
            System.out.print("The List is Empty");
        }
        else{
            DoubleNode tempr=head;
            System.out.print("null<->");
            while(true){
                System.out.print(tempr.data+"<->");
                if(tempr.next==null){
                    break;
                }
                else{
                    tempr=tempr.next;
                }
            }
            System.out.println("null");
        }
    }
    public void traverseReverse(){
        if(tail==null){
            System.out.println("List is Empty");
        }
        else if(head.next==null){
            System.out.println(head.data);
        }
        else{
            DoubleNode temp=tail;
            System.out.print("null<->");
            while(true){
                System.out.print(temp.data+"<->");
                if(temp.prev==null){
                    break;
                }
                else{
                    temp=temp.prev;
                }
            }
        }
        System.out.println("null");
    }
    public void insertEnd(int data){
        DoubleNode node=new DoubleNode(data);
        DoubleNode temp=head;
        if(head==null){
            head=node;
            tail=node;
            count++;
        }
        else{
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
            node.prev=temp;
            node.next=null;
            tail=node;
            count++;
        }
    }
    public void insertBegin(int data){
        DoubleNode node=new DoubleNode(data);
        if(head==null){
            head=node;
            count++;
        }
        else{
            node.next=head;
            head.prev=node;
            head=node;
            count++;
        }
    }
    public void deleteEnd(){
        if(head==null){
            System.out.println("List is Empty");
        }
        else{
            tail=tail.prev;
            tail.next=null;
            count--;
        }
    }
    public void deleteFront(){
        if(head==null){
            System.out.println("List is Empty");
        }
        else{
            head=head.next;
            head.prev=null;
            count--;
        }
    }
       public void cancelInput(int data){
           
       }
}