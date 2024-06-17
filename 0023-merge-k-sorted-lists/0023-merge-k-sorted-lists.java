/**
 * Definition for singly-linked list.
 * public class ListNode{
 *     int val;
 *     ListNodenext;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNodenext) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    //convert array to list
    private ListNode convertToList(ArrayList<Integer> arr){
        if(arr.isEmpty()){
            return null;
        }
        ListNode head=new ListNode(arr.get(0));
        ListNode mover=head;
        int n=arr.size();
        for(int i=1;i<n;i++){
            ListNode temp=new ListNode(arr.get(i));
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> arr=new ArrayList<>();
        int n=lists.length;
        for(int i=0;i<n;i++){
            ListNode temp=lists[i];
            while(temp!=null){
                arr.add(temp.val);
                temp=temp.next;
            }
        }
        Collections.sort(arr);
        ListNode head=convertToList(arr);
        return head;
    }
}