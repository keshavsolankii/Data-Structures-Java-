class Solution {
    public ListNode reverse(ListNode node)   // Reversing the list
    {
        ListNode curr=node;
        ListNode prev = null;
        ListNode forward = null;
        
        while(curr != null)
        {
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;
    }
  
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        if(head == null || head.next == null)
            return true;
        
        while(fast.next != null && fast.next.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode dummy = head;
        slow = slow.next; // At this point the slow pointer will point to the first node of the palindromic part
        
        slow = reverse(slow); // Reversing the palindromic part in order to match with the first half part
        
        while(dummy.val == slow.val && slow != null)  // If the value of first half part and second half part is same then palindrome exists
        {
            slow = slow.next;
            dummy = dummy.next; 
            if(slow == null)
                return true;
        }
        return false;
    }
}
