public class DeleteDuplicateNode {
    static class ListNode{
        int val;
        ListNode next;
        ListNode (int val){
            this.val = val;
        }
    }
    public static ListNode deleteDuplNode(ListNode head){

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        if(head ==null || head.next==null)
            return head;
        while(head!= null){
            if(head.next!=null && head.val== head.next.val){
                while(head.next!=null && head.val== head.next.val){
                    head= head.next;
                }
                prev.next = head.next;
            }else{
                prev = prev.next;
            }
            head= head.next;
        }
        return dummy.next;
    }
     public static void main(String args[]){
        ListNode list = new ListNode(1);
        list.next = new ListNode(1);
        list.next.next = new ListNode(2);
        list.next.next.next = new ListNode(3);
        list.next.next.next.next = new ListNode(3);
        list.next.next.next.next.next = new ListNode(4);
        list.next.next.next.next.next.next = new ListNode(5);


        ListNode removeAllDupliNode = deleteDuplNode(list);

        while(removeAllDupliNode!= null){
            System.out.print(removeAllDupliNode.val + " ");
        removeAllDupliNode = removeAllDupliNode.next;
        }
    }
}
