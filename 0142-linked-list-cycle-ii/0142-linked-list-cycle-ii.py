# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        temp=head
        l=[]
        while temp!=None:
            if temp in l:
                return temp
            l.append(temp)
            temp=temp.next
        return None
        