    def insert(self,head,data):
    #Complete this method
        node = Node(data)
        if head==None :
            return node
        else :
            currentNode=head;
            while currentNode.next != None :
                currentNode=currentNode.next;
            currentNode.next=node
            return head
