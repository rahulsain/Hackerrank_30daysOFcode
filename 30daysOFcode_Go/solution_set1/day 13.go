package main

import "fmt"

type Book struct {
	Title  string
	Author string
}

type Booker interface {
	Display()
}

type MyBook struct {
	Book   Book
	Price  int
}

func(b *MyBook) Display() {
	fmt.Printf("Title: %s\n", b.Book.Author)
	fmt.Printf("Author: %s\n", b.Book.Author)
	fmt.Printf("Price: %d\n", b.Price)
}

func main() {
	a := MyBook{Book{"The Alchemist","Paulo Coelho"},248}
	a.Display()
}