public class CopyRandomPointer {
    static class Node{
        int val;
        Node next;
        Node random;
        Node(int val){
            this.val = val;
        }
    }
    public static Node copyRandomList(Node head){
        if(head == null)
            return null;
        Node curr = head;
        while(curr!= null){
            Node newNode = new Node(curr.val);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = newNode.next;
        }
        curr = head;
        while(curr!= null){
            if(curr.random!= null){
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }
        Node dummy = new Node(-1);
        Node copyCurr = dummy;
        curr = head;
        while(curr!= null){
            copyCurr.next = curr.next;
            copyCurr = copyCurr.next;
            curr.next = copyCurr.next;
            curr = curr.next;
        }
        return dummy.next;

    }
    public static void main(String args[]){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.random = head.next.next;
        head.next.random = head;
        head.next.next.random = head.next;

        Node copyList = copyRandomList(head);
        while(copyList!= null){
            System.out.print(copyList.val + " ");
            if(copyList.random!= null){
                System.out.print("Random: " + copyList.random.val + " ");
            }
            System.out.println();
            copyList = copyList.next;
        }
    }
}
