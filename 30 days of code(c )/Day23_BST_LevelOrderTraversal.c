// Locked Code - START
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
// Locked Code - END

#include <stdbool.h>

struct QueueNode {
    struct Node* treeNode;
    struct QueueNode* next;
};

struct Queue {
    struct QueueNode* head;
    struct QueueNode* tail;
    int size;
};

struct Queue* createQueue() {
    struct Queue* q = malloc(sizeof(struct Queue*));
    q->head = q->tail = NULL;
    q->size = 0;
    return q;
}

struct QueueNode* createQueueNode(Node* treeNode) {
    struct QueueNode* qNode = malloc(sizeof(struct QueueNode*));
    qNode->treeNode = treeNode;
    qNode->next = NULL;
    return qNode;
}

void queuePush(struct Queue* q, struct Node* node) {
    struct QueueNode* qNode = createQueueNode(node);
    if (!q->head) {
        q->head = q->tail = qNode;
    } else {
        q->tail->next = qNode;
        q->tail = qNode;
    }
    ++q->size;
}

struct QueueNode* queuePop(struct Queue* q) {
    if (!q->head) return NULL;
    struct QueueNode* node = q->head;
    q->head = q->head->next;
    if (!q->head) {
        q->tail = NULL;
    }
    --q->size;
    return node;
}

bool isEmpty(struct Queue* q) {
    return q->size == 0;
}

void levelOrder(Node* root){
    struct Queue* q = createQueue();
    queuePush(q, root);
    while (!isEmpty(q)) {
        int qSize = q->size;
        struct QueueNode* qNode = NULL;
        struct Node* treeNode = NULL;
        for (int i = 0; i < qSize; ++i) {
            qNode = queuePop(q);
            treeNode = qNode->treeNode;
            printf("%d ", treeNode->data);
            if (treeNode->left) {
                queuePush(q, treeNode->left);
            }
            if (treeNode->right) {
                queuePush(q, treeNode->right);
            }
            free(qNode);
        }
    }
}

// Locked Code - START
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
// Locked Code - END