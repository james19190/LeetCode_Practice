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
    public ListNode reverseList(ListNode head) {

        Stack<ListNode> stack= new Stack<>();  

        while (head != null){
            stack.push(head);
            head = head.next;
        }

        if(stack.empty()){return null;}

        head = stack.pop();
        ListNode temp = head;
        
        while(!stack.empty()){
            temp.next = stack.pop();
            temp = temp.next;
        }   

        temp.next = null;

        return head;
    }
}
