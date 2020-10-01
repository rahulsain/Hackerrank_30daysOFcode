    def removeDuplicates(self,head):
        #Write your code here
        if head is None:
            return
        current_node = head
        counter = 0
        list_data = {}
        index = 0
        while (current_node is not None):
            if (list_data.get(current_node.data) is None):
                list_data[current_node.data] = counter
            counter += 1
            current_node = current_node.next
            
        new_list = Solution()
        head = None
        for key in sorted(list_data):
            head = new_list.insert(head, key)
            
        return head
            
            
        
                
      
  
  
  
  
  
  