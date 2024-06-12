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
    public int size(ListNode head){
        int counter=0;
        ListNode temp=head;
        while(temp!=null){
            counter++;
            temp=temp.next;
        }
        return counter;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA=size(headA);
        int sizeB=size(headB);
        while(sizeA>sizeB){
            headA=headA.next;
            sizeA--;
        }
        while(sizeA<sizeB){
            headB=headB.next;
            sizeB--;
        }
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
}