public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        
        if(a == null && b == null)
            return null;
        
        while(a != b)
        {
            if(a!=null)
                a = a.next;
            else
                a = headB;  // If a becomes null then change the head of a to b
            
            if(b!=null)
                b = b.next;
            else
                b = headA;  // If b becomes null then change the head of b to a
        }                   // After this loop, both a and b will be at the intersection node
        if(a == b)
            return a;
        else
            return null;
    }
}
