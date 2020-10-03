package main
import "fmt"

func main() {
	var s string
	fmt.Scan(&s)
	obj := &Solution{}
	for _, c := range s {
		obj.pushCharacter(c)
		obj.enqueueCharacter(c)
	}

	isPalindrome := true
	for i := 0; i < len(s)/2; i++ {
		if obj.popCharacter() != obj.dequeueCharacter() {
			isPalindrome = false
			break
		}
	}

	if isPalindrome {
		fmt.Println("The word, "+s+", is a palindrome.")
	} else {
		fmt.Println("The word, "+s+", is not a palindrome.")
	}
}

type Solution struct {
	queue []byte
	stack []byte
}

type (s *Solution) pushCharacter(c byte) {
	s.stack = append(s.stack, c)
}
type (s *Solution) enqueueCharacter(c byte) {
	s.queue = append(s.queue, c)
}
type (s *Solution) popCharacter() (char) {
	c := s.stack[len(s.stack) - 1]
	s.stack = s.stack[0:len(s.stack)]
	return c
}
type (s *Solution) dequeueCharacter() (char) {
	c := s.queue[0]
	s.queue = s.queue[1:len(s.queue)+1]
	return c
}