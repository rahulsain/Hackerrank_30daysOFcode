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

func getHeight(root *Node) int{
	if(root == nil){
		return 0;
	}
	if(root.left == nil && root.right == nil){
		return 0;
	}
	return 1 + max(getHeight(root.left), getHeight(root.right))
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

	fmt.Println(getHeight(root));
}

func max(a, b int) int{
	if a > b{
		return a
	}
	return b
}