/* https://www.hackerrank.com/challenges/30-binary-trees */

	static void levelOrder(Node root){
  		//Write your code here
        Queue Q = new Queue();
        Q.Enqueue(root);
        
        while (Q.Count > 0)
            {
            Node curNode = (Node)Q.Peek();
            if (curNode.left != null)
                Q.Enqueue(curNode.left);
            if (curNode.right != null)
                Q.Enqueue(curNode.right);
            Console.Write(curNode.data + " ");
            Q.Dequeue();
        }
    }