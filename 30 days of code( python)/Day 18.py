class Solution:
    def __init__(self):
        self.my_stack = []
        self.my_queue = []
        
    # Write your code here
    def pushCharacter(self, ch):
        self.my_stack.append(ch)
        
    
    def enqueueCharacter(self, ch):
        self.my_queue.insert(0, ch) # 0 is for the position!
        
    
    def popCharacter(self):
        return self.my_stack.pop()
    
    def dequeueCharacter(self):
        return self.my_queue.pop()