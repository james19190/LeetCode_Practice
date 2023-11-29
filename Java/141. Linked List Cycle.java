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

        if(head==null || head.next==null){
            return false;
        }

        HashSet<ListNode> s = new HashSet<>();

        ListNode currNode = head;

        for(;currNode!=null;currNode = currNode.next){
            if(!s.add(currNode))
                return true;
        }
        return false;
    }
}

        
