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
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = null;
        if(head == null || head.next == null){
            return null;
        }
        else{
            while(fast != null && fast.next != null && slow != null){
                temp = slow;
                fast = fast.next.next;
                slow = slow.next;
            }
            temp.next = slow.next;
        }
        return head;

    }
}