import java.util.*;
import java.io.*;

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

class Solution{
   
	public static int getHeight(Node root){
      //Write your code here
       Node p;
       p=root;
      
      if(p==null)
        return -1;
      else
      {     
            int l = getHeight(p.left);
            int r=getHeight(p.right);
            
            if(l>r)
              return l+1;
           else return r+1;    
      }   
    }

	public static Node insert(Node root,int data){
    if(root==null){
      return new Node(data);
    }
    else{
      Node cur;

      if(data<=root.data){
          cur=insert(root.left,data);
          root.left=cur;
      }
      else{
          cur=insert(root.right,data);
          root.right=cur;
      }
      return root;
    }
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int T=sc.nextInt();
    Node root=null;
    while(T-->0){
        int data=sc.nextInt();
        root=insert(root,data);
    }
    int height=getHeight(root);
    System.out.println(height);
  }
}    