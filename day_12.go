package main

import "fmt"

type Person struct {
	FirstName string
	LastName  string
	IdNumber  int
}

func(p *Person) PrintPerson() {
	fmt.Printf("Name: %s, %s\n", p.LastName, p.FirstName)
	fmt.Printf("ID: %d\n", p.IdNumber)
}

type Student struct {
	Person Person
	Score []int
}

func(s *Student) Calculate() string {
	total := 0
	for i := range s.Score {
		total = total + s.Score[i]
	}
	grade := total/len(s.Score)
	if grade >= 90 && grade <= 100 {
		return "O"
	} else if grade >= 80 && grade < 90 {
		return "E"
	} else if grade >= 70 && grade < 80 {
		return "A"
	} else if grade >= 55 && grade < 70 {
		return "P"
	} else if grade >= 40 && grade < 55 {
		return "D"
	} else {
		return "T"
	}
}

func main() {

	a := Student{Person{"Abhishek", "Singh", 123}, []int{100,100,75}}
	a.Person.PrintPerson()
	fmt.Println("Grade:", a.Calculate())
}