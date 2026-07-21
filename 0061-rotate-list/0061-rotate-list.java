class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0)
            return head;

        
        int len = 1;
        ListNode tail = head;

        while (tail.next != null) {
            tail = tail.next;
            len++;
        }

        k = k % len;

        if (k == 0)
            return head;

        int position = len - k - 1;

        ListNode newTail = head;

        while (position-- > 0) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;

        newTail.next = null;
        tail.next = head;

        return newHead;
    }
}