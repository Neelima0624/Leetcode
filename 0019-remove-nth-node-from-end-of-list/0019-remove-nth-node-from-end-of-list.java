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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int c=0;
        ListNode curr = head;
        while(curr!=null)
        {
            c = c+1;
            curr=curr.next;
        }
        if(c-n==0)
        {
           return head.next;
        }
        int p = c-n;
        curr = head;
        for(int i=1;i<p;i++)
        {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
}