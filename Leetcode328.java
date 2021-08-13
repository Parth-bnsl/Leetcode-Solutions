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
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenhead = even;// this node will be connected to the end of the odd
        while(even != null && even.next != null){
            //next to an even is odd number
            //even is from original
            //odd is new 
            odd.next = even.next; 
            odd = odd.next; //traversing
            even.next = odd.next; //same logic as above
            even = even.next;
        }
        odd.next = evenhead;
        return head;
    }
}
