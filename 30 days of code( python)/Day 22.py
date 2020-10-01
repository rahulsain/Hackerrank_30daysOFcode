    def getHeight(self,root):
        if (root is None):
            return -1
        
        else:
            return max(self.getHeight(root.left), self.getHeight(root.right)) + 1
            
            
        
