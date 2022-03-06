package likedlistImplementation;

import java.sql.SQLOutput;

public class addElementLast {
    Node head;
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }//node class complete
    //method for add element at last
    public void elementAtLast(int val){
        Node newNode= new Node(val);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    //for display the element
    public void display(){


        if(head==null){
            System.out.println("List is empty");
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.val+"->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        addElementLast list=new addElementLast();
        list.elementAtLast(1);
        list.display();
        list.elementAtLast(2);
        list.display();
        list.elementAtLast(3);
        list.display();
        list.elementAtLast(4);
        list.display();
    }
}
