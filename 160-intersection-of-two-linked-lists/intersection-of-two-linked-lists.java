/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode currA = headA;
        while(currA != null){
            ListNode currB = headB;
            while(currB != null){
                if(currA == currB){
                    return currA;
                }
                currB = currB.next;
            }
            currA = currA.next;
        }
        return null;
    }
}