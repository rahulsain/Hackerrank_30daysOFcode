package main  
import (  
 "fmt"  
)  
  
func CheckPrime(number int) {  
 isPrime := true  
 if number <= 1 {  
  fmt.Println("Not prime")  
 } else if number<=3{
    fmt.Println("Prime") 
 } else if number%3==0 || number%2==0 {
     fmt.Println("Not prime")
 } else {  
  for i := 5; i*i <= number; i=i+6 {  
   if number%i == 0||number%(i+2)==0 {  
    fmt.Println("Not prime")  
    isPrime = false  
    break  
   }  
  }  
  if isPrime == true {  
   fmt.Println("Prime")  
  }  
 }  
}  
func main() {  
 var t int;
 fmt.Scanln(&t)
 for i:=0; i<t ;i++ {
    var number int  
    fmt.Scanln(&number)  
    CheckPrime(number) 
 }
}  