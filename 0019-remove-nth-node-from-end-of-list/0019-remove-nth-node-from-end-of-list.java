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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        //edge case
        if(n==size){
            return head.next;
        }
        //type of pointer
        int i=0;
        int itoFind=size-n-1;//0 based indexing and to find that particular node from end
        ListNode prev=head;
        while(i<itoFind){
            prev=prev.next;//heave to skip
            i++;
        }
        //to remove that node 
        prev.next=prev.next.next;
        return head;
    }
}