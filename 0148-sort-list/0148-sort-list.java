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
    public ListNode sortList(ListNode head) {
    if(head==null || head.next==null)
    {
        return head;
    }
    ListNode left=null;
    ListNode right=null;
    if(head.next.next==null)
    {
        right=sortList(head.next);
        head.next=null;
        left=sortList(head);
    }
    else{
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&& fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp = slow.next;
        slow.next=null;
        left = sortList(head);
        right=sortList(temp);
    }
    return mergeTwoLists(left,right);
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null)
        {
            return list2;
        }
        if(list2==null)
        {
            return list1;
        }
        if(list1.val<list2.val)
        {
           list1.next =  mergeTwoLists(list1.next,list2);
            return list1;
        }
        else{
            list2.next = mergeTwoLists(list1,list2.next);
            return list2;
        }
    }
}