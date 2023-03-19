class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode curr = head;
        int len=1;
        
        if(head == null || head.next == null || k == 0)
            return head;
        
        while(curr.next != null)  //counting the total number of nodes
        {
            curr = curr.next;
            len++;
        }
        
        curr.next = head; // linking the tail to the head( making circular LL)
        
        k = k%len;  // Instead of rotating k times...take modulo of k with the length because the output will be the same
        k = len-k;  // Instead of rotating the LL, just make the next of (len-k)th node to null and make the (len-k+1)th node the head
        
        while(k-- > 0)
        {
            curr = curr.next;
        }
        head = curr.next;
        curr.next = null;
        
        return head;
    }
}
