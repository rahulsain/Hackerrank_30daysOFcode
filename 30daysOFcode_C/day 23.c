#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

typedef struct Node{
    struct Node* left;
    struct Node* right;
    int data;
}Node;
Node* newNode(int data){
    Node* node=(Node*)malloc(sizeof(Node));
    node->left=node->right=NULL;
    node->data=data;
    return node;
}

typedef struct queueNode{
    Node* treeNode; 
    struct queueNode* next;
}queueNode;

typedef struct queue{
    queueNode* head;
}queue;

void push(queue* theQueue, Node* treeNode) {
    queueNode* insertNode = (queueNode*)malloc(sizeof(queueNode));
    insertNode->next=NULL;
    insertNode->treeNode = treeNode;
    if(theQueue->head == NULL) {
        theQueue->head = insertNode;
    } else {
        queueNode * temp = theQueue->head;
        while(temp->next != NULL) {
            temp = temp->next;
        }
        temp->next = insertNode;
    }
}

queueNode* pop(queue* theQueue) {
    queueNode* returnNode = NULL;
    if(theQueue->head == NULL) {
        printf("please stop\n");
    } else {
        returnNode = theQueue->head;
        theQueue->head = theQueue->head->next;
    }
    return returnNode;
}


void levelOrder(Node* root){
    queue * theQueue = (queue*)malloc(sizeof(queue));
    theQueue->head = NULL;
    push(theQueue, root);
    while(theQueue->head != NULL) {
        queueNode* poppedNode = pop(theQueue);
        printf("%d ", poppedNode->treeNode->data);
        if(poppedNode->treeNode->left != NULL) {
            push(theQueue, poppedNode->treeNode->left);
        }
        if(poppedNode->treeNode->right != NULL) {
            push(theQueue, poppedNode->treeNode->right);
        }
    }
}


Node* insert(Node* root,int data){
    if(root==NULL)
        return newNode(data);
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
        
    }
    return root;
}
int main(){
    Node* root=NULL;
    int T,data;
    scanf("%d",&T);
    while(T-->0){
        scanf("%d",&data);
        root=insert(root,data);
    }
    levelOrder(root);
    return 0;
    
}