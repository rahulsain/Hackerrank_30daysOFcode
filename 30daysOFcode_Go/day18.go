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
	queue []rune
	stack []rune
}

func (s *Solution) pushCharacter(c rune) {
	s.stack = append(s.stack, c)
}
func (s *Solution) enqueueCharacter(c rune) {
	s.queue = append(s.queue, c)
}
func (s *Solution) popCharacter() (rune) {
	c := s.stack[len(s.stack) - 1]
	s.stack = s.stack[:len(s.stack) - 1]
	return c
}
func (s *Solution) dequeueCharacter() (rune) {
	c := s.queue[0]
	s.queue = s.queue[1:]
	fmt.Println(c)
	return c
}
