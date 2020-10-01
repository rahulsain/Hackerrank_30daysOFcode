#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

typedef struct Node
{
    struct Node *left;
    struct Node *right;
    int data;
} Node;
Node *newNode(int data)
{
    Node *node = (Node *)malloc(sizeof(Node));
    node->left = node->right = NULL;
    node->data = data;
    return node;
}

int max(int n, int m)
{
    if (m > n)
        return m;
    else
        return n;
}

int height(Node *root)
{
    // Write your code here.
    if (root == NULL)
    {
        return 0;
    }
    if (root->left == NULL && root->right == NULL)
    {
        return 0;
    }
    return max(height(root->left) + 1, height(root->right) + 1);
}

void printlevel(Node *root, int level)
{
    if (root == NULL)
        return;
    if (level == 0)
        printf("%d ", root->data);
    else
    {
        printlevel(root->left, level - 1);
        printlevel(root->right, level - 1);
    }
}

void levelOrder(Node *root)
{
    int h = height(root);
    for (int i = 0; i <= h; i++)
    {
        printlevel(root, i);
    }
}

Node *insert(Node *root, int data)
{
    if (root == NULL)
        return newNode(data);
    else
    {
        Node *cur;
        if (data <= root->data)
        {
            cur = insert(root->left, data);
            root->left = cur;
        }
        else
        {
            cur = insert(root->right, data);
            root->right = cur;
        }
    }
    return root;
}
int main()
{
    Node *root = NULL;
    int T, data;
    scanf("%d", &T);
    while (T-- > 0)
    {
        scanf("%d", &data);
        root = insert(root, data);
    }
    levelOrder(root);
    return 0;
}
