package main

import (
    "fmt"
)

type Node struct{
	data int
	left *Node
	right *Node
}

func createNode(data int) *Node{
	node := new(Node)
	node.data = data

	return node
}

func insert(root *Node, data int) *Node{
	if(root == nil){
		return createNode(data)
	} 

	var cur *Node
	if(data <= root.data){
		cur = insert(root.left, data);
		root.left = cur;
	} else{
		cur = insert(root.right, data);
		root.right = cur;
	}

	return root;

}

func levelOrder(root *Node) {
	if(root == nil){
		return
	}
	queue := make([] *Node, 0)
	queue = append(queue, root)
	
	for len(queue) > 0 {
		cur := queue[0]
		queue = queue[1:]
		fmt.Printf("%d ", cur.data)

		if cur.left != nil{
			queue = append(queue, cur.left)
		}
		if cur.right != nil{
			queue = append(queue, cur.right)
		}
	}
	fmt.Println("")
}

func main() {
	var n, data int
	var root *Node

	fmt.Scanf("%d", &n)

	for n > 0{
		fmt.Scanf("%d", &data)
		root = insert(root, data)
		n--
	}
	levelOrder(root)
}