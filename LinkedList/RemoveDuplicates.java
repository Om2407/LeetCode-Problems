public class RemoveDuplicates {
    //lc83. Remove Duplicates from Sorted List
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static ListNode removeAllduplicates(ListNode head){
        ListNode curr =head;
        while(curr!= null && curr.next!= null){
            if(curr.val == curr.next.val){
                curr.next = curr.next.next;
            }else{
                curr= curr.next;
            }
        }
        return head;
    }
    public static void main(String args[]){
        ListNode head= new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        ListNode result = removeAllduplicates(head);
        while(result!= null){
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
