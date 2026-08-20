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
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null)
        return head;

        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode right=slow.next;
        slow.next=null;
        ListNode left=sortList(head);
        right=sortList(right);
        return merge(left,right);
    }
    ListNode merge(ListNode left,ListNode right){
        ListNode temp=new ListNode(0);
        ListNode curr=temp;
        while(left!=null && right!=null){
            if(left.val<=right.val){
                curr.next=left;
                curr=curr.next;
                left=left.next;
            }else if(right.val<left.val){
                curr.next=right;
                curr=curr.next;
                right=right.next;
            }
        }
            while(left!=null){
                curr.next=left;
                left=left.next;
                curr=curr.next;
            }
            while(right!=null){
                curr.next=right;
                curr=curr.next;
                right=right.next;
            }
        
        return temp.next;
    }
    
}