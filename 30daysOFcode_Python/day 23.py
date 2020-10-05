#!/bin/python3

import sys

class Node:
    def __init__(self,data):
        self.right=self.left=None
        self.data = data
class Solution:
    def insert(self,root,data):
        if root==None:
            return Node(data)
        else:
            if data<=root.data:
                cur=self.insert(root.left,data)
                root.left=cur
            else:
                cur=self.insert(root.right,data)
                root.right=cur
        return root

    def levelOrder(self,root):
        result = ""
        q = [root]
        while len(q):
            qLen = len(q)
            for i in range(qLen):
                node = q[0]
                q = q[1:]
                result += str(node.data) + " "
                if node.left:
                    q.append(node.left)
                if node.right:
                    q.append(node.right)
        print (result)

T=int(input())
myTree=Solution()
root=None
for i in range(T):
    data=int(input())
    root=myTree.insert(root,data)
myTree.levelOrder(root)
