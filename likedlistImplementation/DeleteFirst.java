package likedlistImplementation;

public class DeleteFirst {
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
    //delete first element
    public void deleteFirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        head=head.next;
    }
    //delete last element
    public void deleteLast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        //if only one element in the list
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
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
        DeleteFirst df= new DeleteFirst();
        df.elementAtLast(1);
        df.display();
        df.elementAtLast(2);
        df.display();
        df.elementAtLast(3);
        df.display();
        df.elementAtLast(4);
        df.display();
        df.deleteFirst();
        df.display();
        df.elementAtLast(88);
        df.display();
        df.deleteLast();
        df.display();
    }
}
