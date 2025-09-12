# Last updated: 12/09/2025, 19:22:29
# Definition for singly-linked list.
# Provided by LeetCode
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def getDecimalValue(self, head: ListNode) -> int:
        num = 0
        while head:
            num = num * 2 + head.val  # or use: num = (num << 1) | head.val
            head = head.next
        return num

