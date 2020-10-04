#include <iostream>
#include <cstddef>
#include <queue>
#include <string>
#include <cstdlib>

using namespace std;	
class Node{
    public:
        int data;
        Node *left,*right;
        Node(int d){
            data=d;
            left=right=NULL;
        }
};
class Solution{
    public:
  		Node* insert(Node* root, int data){
            if(root==NULL){
                return new Node(data);
            }
            else{
                Node* cur;
                if(data<=root->data){
                    cur=insert(root->left,data);
                    root->left=cur;
                }
                else{
                   cur=insert(root->right,data);
                   root->right=cur;
                 }           
           return root;
           }
        }

	void levelOrder(Node * root){
        queue<Node*> q;
        // Start queue with root node
        q.push(root); 
        // Run the statements until the queue is not empty
        while(!q.empty()) {
            // Create a new node using root node(inserted earlier)
            Node* node = q.front();
            // Prints out the data present in that node
            cout << node->data << " ";
            // Pop out the node's address
            q.pop();
            // If node has a left child push that to queue
            if(node->left)
                q.push(node->left);
            // If node has a right child push that to queue
            if(node->right)
                q.push(node->right);
        }
	}

};//End of Solution

int main(){
    Solution myTree;
    Node* root=NULL;
    int T,data;
    cin>>T;
    while(T-->0){
        cin>>data;
        root= myTree.insert(root,data);
    }
    myTree.levelOrder(root);
    return 0;
}