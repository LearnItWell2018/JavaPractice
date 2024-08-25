public class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList1 {
    Node head;


    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;


        }else{
            Node current = head;
            while (current .next !=null){
                current = current.next;
            }
            current.next = newNode;

        }
    }
    public Node findNthNode(int n){
        Node current = head;
        int count = 0;
        while(current !=null){
            if (count==n){
                return current;
            }
            count++;
            current = current.next;
        }
        return null;

    }


}
