// Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

class Solution {
    public ListNode oddEvenList(ListNode head) {
        
        if(head == null || head.next == null)
            return head;
        
        ListNode odd = head;
        ListNode even = head.next;
        ListNode even_head = head.next;
        
        while(even != null && even.next != null)
        {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = even_head;
        return head;
    }
}
