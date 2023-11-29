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
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode root = head;
        int curr, next;

        while (head != null){
            curr = head.val;
            if(head.next == null) {break;}
            next = head.next.val;

            if(curr == next){
                head.next = head.next.next;
            }
            else {
                head = head.next;
            }
            
        }

        return root;
    }
}
