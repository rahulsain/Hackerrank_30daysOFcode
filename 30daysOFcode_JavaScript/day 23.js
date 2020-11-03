// Start of function Node
function Node(data) {
    this.data = data;
    this.left = null;
    this.right = null;
}; // End of function Node

// Start of function BinarySearchTree
function BinarySearchTree() {
    this.insert = function(root, data) {
        if (root === null) {
            this.root = new Node(data);
            
            return this.root;
        }
        
        if (data <= root.data) {
            if (root.left) {
                this.insert(root.left, data);
            } else {
                root.left = new Node(data);
            }
        } else {
            if (root.right) {
                this.insert(root.right, data);
            } else {
                root.right = new Node(data);
            }
        }
        
        return this.root;
    };
    
    // Start of function levelOrder
    this.levelOrder = function(root) {
        var que = [root];

//if que has length at all
    while( que.length ) {

    //shift removes first element in array and returns it.
    var treeNode = que.shift();
           
    //print the node's data that was just removed
    process.stdout.write(treeNode.data + ' ');
           
    //if node has a left child, push to que
    if(treeNode.left) {
        que.push(treeNode.left);
    }    
           
    //if node has right child, push to que
    if(treeNode.right) {
        que.push(treeNode.right);
    }
           
}
    
	}; // End of function levelOrder
