package likedlistImplementation;

public class AddElementFirst {
    Node head;
    class Node {
        int val;
        Node next;

        //constructor of Node class
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }//Node class is finish
        //method for adding the first element
        public void addElement(int val){
            Node newNode=new Node(val);
            if(head==null){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        //for display the element of list
        public void display() {
            if (head == null) {
                System.out.println("list is empty");
            }
            Node currNode = head;
            while (currNode != null) {
                System.out.print(currNode.val + "->");
                currNode = currNode.next;
            }
            System.out.println("null");

    }

    public static void main(String[] args) {
        AddElementFirst o1=new AddElementFirst();
        o1.addElement(5);
        o1.display();
        o1.addElement(4);
        o1.display();
        o1.addElement(3);
        o1.display();
        o1.addElement(2);
        o1.display();
        o1.addElement(1);
        o1.display();
    }
}
