package main

type Node struct {
	data interface{}
	next *Node
}

type LinkedList struct {
	head *Node
	tail *Node
	size int
}

func(list *LinkedList) Add(item interface{}) {
	newElement := &Node{data:item}
	if list.size == 0{
		list.head = newElement
		list.tail = newElement
	} else {
		list.tail.next = newElement
		list.tail = newElement
	}
	list.size++
}

func New() *LinkedList {
	return &LinkedList{}
}

func main() {
	a := New()
	for i:=0; i<5; i++ {
		a.Add(i)
	}
}