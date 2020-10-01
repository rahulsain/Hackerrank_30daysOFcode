# Day 0: Hello, World

>  Welcome to 30 days of Code in C Language !!




## [Problem Link](https://www.hackerrank.com/challenges/30-hello-world/problem)

>Try Solving Yourself First


# Some Useful Articles
1. [ Input with spaces ](https://stackoverflow.com/questions/39431924/what-does-n-mean-in-c)
2. [ gets in c ](https://stackoverflow.com/questions/4346598/gets-function-in-c )


`Note this is only one approach we are happy to hear  your approach`







## Pseudo Code
- Take input from the user (input may contain space)
- print to the screen 'Hello World' 
- on the next line print the string user entered

**********









```c
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
//standard header files
int main() {
    // Declare a variable named 'input_string' to hold our input.
    char input_string[105]; 
    
    //Will read user input until enter is pressed or a newline character is added (\n) and store it into a variable named input_string
    scanf("%[^\n]s", input_string); 
    
    // Print a string literal saying "Hello, World." to stdout using printf.
    printf("Hello, World.\n");
    
    // TODO: Write a line of code here that prints the contents of input_string to stdout.
        
    printf("%s",input_string);


    return 0;
}


```

