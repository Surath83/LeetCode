/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return false;
        if(head.next == null) return true;
        Stack<Integer> stack = new Stack<>();
        int size = 0;
        ListNode curr = head;
        while(curr != null){
            size++;
            curr = curr.next;
        }
        if(size%2 == 0){
            size = size/2;
        for(int i=0; i<size; i++){
            stack.push(head.val);
            head = head.next;
        }
        while(!stack.isEmpty() && head != null){
            if(stack.pop() != head.val){
                return false;
            }
            head = head.next;
        }
        }else{
            size = size/2;
        for(int i=0; i<=size; i++){
            if(i == size){
                head = head.next;
                break;
            }
            stack.push(head.val);
            head = head.next;
        }
        while(!stack.isEmpty() && head != null){
            System.out.println(stack.peek()+" and "+head.val);
            if(stack.pop() != head.val){
                return false;
            }
            head = head.next;
        }
        }
        return true;
    }
}