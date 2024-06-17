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
    
    private ListNode mergetwoLists(ListNode list1,ListNode list2){
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        if(list1.val<=list2.val){
            ListNode res=list1;
            list1.next=mergetwoLists(list1.next,list2);
            return res;
        }else{
            ListNode res=list2;
            list2.next=mergetwoLists(list1,list2.next);
            return res;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res=null;
        //for each loop
        for(ListNode list:lists){
            res=mergetwoLists(res,list);
        }
        return res;
    }
}