import java.io.*;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}
class Solution
{

    public static Node removeDuplicates(Node head) {
      //Write your code here
        Node p = head;
/*
        while (p.next != null) {
            if (p.data == p.next.data)
                p.next = p.next.next;
                
            p = p.next;
        }
  */
  
  while(p!=null)
  { Node q=p.next;
    while(q!=null)
    {
        if(p.data==q.data)
            p.next=q.next;
        q=q.next;    
    }
    p=p.next;
  }
  
        return head;

    }

    public static  Node insert(Node head,int data)