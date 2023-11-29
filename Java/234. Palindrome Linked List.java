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
        
        int length = 0;

        ListNode temp = head; 
        while (temp != null){
            length++;
            temp = temp.next;
        }

        int[] values = new int[length];

        for(int i = 0; i < length; i++){
            values[i] = head.val;
            head = head.next;
        }

        for (int i = 0; i < length/2; i++){
            if (values[i] != values[length-i-1]){return false;}
        }

        return true;
    }
}



/*

        //REGULAR EXPRESSIOM
        String temp = s.toLowerCase().replaceAll("[^a-zA-Z0-9]," "");
        boolean palin = true;
        for (int i = 0; i < temp.length()/2; i++){
            if (temp.charAt(i) != temp.charAt(temp.length()-i-1)) {
                palin = false; 
                break;
            }
        }
        return palin;
        8*/
