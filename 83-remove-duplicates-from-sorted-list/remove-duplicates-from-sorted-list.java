class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> set = new LinkedHashSet<>();
        ListNode curr = head;
        while(curr != null){
            set.add(curr.val);
            curr = curr.next;
        }
        ListNode ans = new ListNode(0);
        ListNode ln = ans;

        for(int j:set){
            ln.next = new ListNode(j);
            ln = ln.next;
        }
        return ans.next;
    }
}