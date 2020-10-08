class NodeTree {
    left: NodeTree;
    right: NodeTree;
    data: number;

    constructor(data: number) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinarySearchTreeSolution {

    insert(root: NodeTree, data: number): NodeTree {
        if (root == null) {
            root = new NodeTree(data);
            return root;
        }
        if (data <= root.data) {
            if (root.left) {
                this.insert(root.left, data);
            } else {
                root.left = new NodeTree(data);
            }
        }
        return root;
    };

    levelOrder(root: NodeTree) {
        var que: Array<NodeTree> = [root];

        while (que.length) { // if que has length at all
            var treeNode: NodeTree = que.shift(); // shift removes first element in array and returns it.

            console.log("just removed node data " + treeNode.data); // print the node's data that was just removed
            if (treeNode.left) { // if node has a left child, push to que
                que.push(treeNode.left);
            }
            if (treeNode.right) { // if node has right child, push to que
                que.push(treeNode.right);
            }
        }
    }


}
