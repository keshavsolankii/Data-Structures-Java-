// Given the head of a linked list, remove the nth node from the end of the list and return its head.

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode();
        start.next = head;
        
        ListNode fast = start;
        ListNode slow = start;
        
        for(int i=0; i<n; i++) // run the fast pointer for n times
        {
            fast = fast.next;
        }
        while(fast.next != null)
        {
            fast = fast.next;
            slow = slow.next; // slow pointer stops at one node before the node to be removed
        }
        slow.next = slow.next.next; // connect the next of the node to the next of next node
        
        return start.next;
    }
}
