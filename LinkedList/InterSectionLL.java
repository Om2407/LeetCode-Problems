public class InterSectionLL {
static class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
}
public static ListNode getIntersection(ListNode headA,ListNode headB){

    ListNode a = headA;
    ListNode b = headB;
    if(headA==null || headB==null ){
        return null;
    }
    while(a!=b){
        a = (a==null)?headB :a.next;
        b = (b==null)?headA :b.next;
    }
    return a;
}
public static void main(String args[]) {
        // common part [8 → 4 → 5]
        ListNode common = new ListNode(8);
        common.next = new ListNode(4);
        common.next.next = new ListNode(5);

        // List A [4 → 1 → 8 → 4 → 5]
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = common;

        //List B [ 5 → 6 → 1 → 8 → 4 → 5]
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = common;
        ListNode InterSection = getIntersection(headA, headB);

        if(InterSection!=null){
            System.out.println("Intersection at Node : " + InterSection.val);

        }else{
            System.out.println("No InterSection");
        }
    }
}
