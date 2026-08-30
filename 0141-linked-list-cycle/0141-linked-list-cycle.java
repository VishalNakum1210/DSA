/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        ListNode curr = head;
        ListNode pre = head;
        while(curr != null && curr.next != null){
            curr = curr.next.next;
            pre = pre.next;
            if(pre == curr) return true;
        }
        return false;
    }
}