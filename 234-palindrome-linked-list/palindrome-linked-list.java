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
        Stack<ListNode> reverse = new Stack<ListNode>();
        ListNode dummy = head;
        while(dummy!=null){
            reverse.push(dummy);
            dummy = dummy.next;
        }
        while(head!=null && !reverse.isEmpty()){
            if(reverse.pop().val != head.val){
                return false;
            }
            else{
                head = head.next;
            }
        }
        return true;
    }
}