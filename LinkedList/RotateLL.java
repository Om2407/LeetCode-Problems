public class RotateLL {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static ListNode rotateRight(ListNode head, int k){
        if(head == null || head.next == null || k == 0)
            return head;

        ListNode oldTail = head;
        int length = 1;
        while(oldTail.next != null){
            oldTail = oldTail.next;
            length++;
        }
        oldTail.next = head;

        ListNode newTail = head;
        for(int i=0; i< length - k % length -1; i++){
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
    public static void main(String args[]){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;
        ListNode rotatedList = rotateRight(head, k);

        while(rotatedList != null){
            System.out.print(rotatedList.val + " ");
            rotatedList = rotatedList.next;
        }
    }
}
