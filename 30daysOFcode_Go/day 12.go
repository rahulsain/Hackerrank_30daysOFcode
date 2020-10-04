package main

import "fmt"

/* Hackerrank does not support Go for problem 12 - inheritance*/

type human interface {
	greet()
}

// If a type implements the human interface, then print their details
func printPerson(h human) {
	switch h.(type) {
	case person:
		fmt.Printf("Name: %v, %v\n", h.(person).firstName, h.(person).lastName)
		fmt.Printf("ID: %v\n", h.(person).idNumber)
	case student:
		fmt.Printf("Name: %v, %v\n", h.(student).firstName, h.(student).lastName)
		fmt.Printf("ID: %v\n", h.(student).idNumber)
	}
}

type person struct {
	firstName, lastName string
	idNumber            int
}

// Method for type person that implements the human interface
func (p person) greet() {
	fmt.Printf("Hi, my name is %s\n", p.firstName)
}

type student struct {
	firstName, lastName string
	idNumber            int
	scores              []int
}

// Method for type student that implements the human interface
func (s student) greet() {
	fmt.Printf("Hi, my name is %s\n", s.firstName)
}

// Method to calculate a students average score
func (s student) calculate() int {
	total := 0
	n := len(s.scores)

	for _, val := range s.scores {
		total += val
	}

	return total / n
}

func main() {
	john := person{"John", "Smith", 13}
	printPerson(john)

	sally := student{
		firstName: "Sally",
		lastName:  "Smith",
		idNumber:  19,
		scores:    []int{100, 80},
	}

	printPerson(sally)
	avg := sally.calculate()
	fmt.Println("Sally's average score is:", avg)
}
