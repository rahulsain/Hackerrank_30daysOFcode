    def levelOrder(self,root):
        queue = [root] if root else []
        output = []
    
        while queue:
            node = queue.pop()
            output.append(node.data)
        
            if node.left: queue.insert(0,node.left)
            if node.right: queue.insert(0,node.right)
        
        print " ".join([str(name) for name in output])
         
        
                
                
              
        
        
  	     