class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        Node fast = head;
        Node slow = head;
        
        if(head == null)
        return 0;
        
        while(fast.next != null)  // To check if cycle is present
        {
            fast = fast.next;
            slow = slow.next;
            
            if(fast.next == null)
                return 0;
            else
                fast = fast.next;
                
            if(fast == slow)
                break;
        }
        if(fast.next == null)
        return 0;
        
        slow = head;
        
        while(slow != fast)   // Ti get the starting node of the cycle
        {
            fast = fast.next;
            slow = slow.next;
        }
        
        Node dummy = slow;    // Creating a dummy node in order to match after completing the round
        int cnt = 1;
        slow = slow.next;
        
        while(slow != dummy){
            slow = slow.next;
            cnt++;
        }
        return cnt;
            
    }
}
