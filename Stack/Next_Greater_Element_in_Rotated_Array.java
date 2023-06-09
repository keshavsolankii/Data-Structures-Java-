class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        
        for(int i=2*nums.length; i>=0; i--)     // T.C = O(2n)
        {
            while(!st.isEmpty() && st.peek() <= nums[i%nums.length]) //Modulo is used for maintaining the size of array     --> T.C = O(2n)
                st.pop();
            
            if(i<nums.length)
            {
                if(!st.isEmpty())
                    ans[i%nums.length] = st.peek();
                else
                    ans[i%nums.length] = -1;
            }
            st.push(nums[i%nums.length]);
        }
        return ans;
    }
}

// Total T.C = O(n)
