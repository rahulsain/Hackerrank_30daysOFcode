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
        queue = [root]
        while(len(queue) != 0):
            curr_root = queue[0]
            print(curr_root.data, end=' ')
            del queue[0]
            if(curr_root.left != None):
                queue.append(curr_root.left)
            if(curr_root.right != None):
                queue.append(curr_root.right)
            
        

T=int(input())
myTree=Solution()
root=None
for i in range(T):
    data=int(input())
    root=myTree.insert(root,data)
myTree.levelOrder(root)
