// You are given the heads of two sorted linked lists list1 and list2.
// Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
// Return the head of the merged linked list.

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        if(l1.val >= l2.val)
        {
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }
        ListNode ans = l1;
        while(l1 != null && l2 != null)
        {
            ListNode curr = null;
            while(l1 != null && l1.val <= l2.val)
            {
                curr = l1;
                l1 = l1.next;
            }
            curr.next = l2;
            
            //swapping
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }
        return ans;
    }
}
