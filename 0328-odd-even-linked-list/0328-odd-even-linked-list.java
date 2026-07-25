/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode cur1 = odd;
        ListNode cur2 = even;
        while(cur2!=null && cur2.next!=null){
            cur1.next=cur1.next.next;
        cur1=cur1.next;
        cur2.next=cur2.next.next;
        cur2=cur2.next;
        }
        cur1.next = even;
        return head;
    }
}