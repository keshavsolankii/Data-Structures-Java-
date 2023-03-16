// Given the head of a singly linked list, return the middle node of the linked list.
// If there are two middle nodes, return the second middle node.

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next != null)
        {
            fast = fast.next;
            slow = slow.next;
            
            if(fast.next != null)
                fast = fast.next;
        }
        return slow;
    }
}
