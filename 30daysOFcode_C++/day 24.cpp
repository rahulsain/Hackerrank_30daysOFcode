#include <cstddef>
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;	
class Node
{
    public:
        int data;
        Node *next;
        Node(int d){
            data=d;
            next=NULL;
        }
};
class Solution{
    public:

        Node* removeDuplicates(Node *head) {
        // As per the question, the head pointer may be null
        // So we check and return head if it's null
        if(!head) return head;
        // Create a new node pointer which is pointing to the
        // same address as head is pointing
        Node* curr = head;
        // Condition check inside while will return false only
        // for the last node
        while(curr->next != NULL) {
            // Checking whether the data of the present node
            // equals next node data in order to remove duplicates
            // If there are duplicates store the address of next 
            // to next node in the current node skipping the next node
            // because it contains the duplicate value
            if(curr->data == curr->next->data)
                curr->next = curr->next->next;
            // Else just move the current pointer to next node
            else curr = curr->next;
        }
        return head;
        }

          Node* insert(Node *head,int data)
          {
               Node* p=new Node(data);
               if(head==NULL){
                   head=p;  

               }
               else if(head->next==NULL){
                   head->next=p;

               }
               else{
                   Node *start=head;
                   while(start->next!=NULL){
                       start=start->next;
                   }
                   start->next=p;   

               }
                    return head;
                
            
          }
          void display(Node *head)
          {
                  Node *start=head;
                    while(start)
                    {
                        cout<<start->data<<" ";
                        start=start->next;
                    }
           }
};
			
int main()
{
	Node* head=NULL;
  	Solution mylist;
    int T,data;
    cin>>T;
    while(T-->0){
        cin>>data;
        head=mylist.insert(head,data);
    }	
    head=mylist.removeDuplicates(head);

	mylist.display(head);
		
}