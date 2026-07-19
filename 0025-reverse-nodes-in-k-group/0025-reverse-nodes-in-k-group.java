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
    void reverse(ListNode head,int time){
        ListNode curr=head;
        ListNode prev=null;
        while(time-->0){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null){
            return null;
        }
        if(k==0){
            return head;
        }
        
        ListNode prevleft=null;
        ListNode left=head;
        ListNode right;
        ListNode res=null;
        int size=k;
        while(true){
            right=left;
            for(int i=0;i<size-1;i++){
                if(right==null){
                    break;
                }
                right=right.next;
            }
            if(right!=null){
            ListNode nextleft=right.next;
            reverse(left,size);
            if(prevleft!=null){
            prevleft.next=right;
            }
            prevleft=left;
            if(res==null)
                res=right;
            left=nextleft;
            }else{
                if(prevleft!=null)
                    prevleft.next=left;
                if(res==null){
                    res=left;
                }
                break;
            }
        }
        return res;
    }
}