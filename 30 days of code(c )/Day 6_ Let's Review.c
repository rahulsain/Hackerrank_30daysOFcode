#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

void printEvenIndexChar(char arr[]){
        int len = strlen(arr);
        for (int i = 0;i < len; i+=2){
            
            printf("%c", arr[i]);
        }

}

void printOddIndexChar(char arr[]){
       int len = strlen(arr);
       for (int i = 1;i < len; i+=2){
           
            printf("%c", arr[i]);
       }

    }

int main() {


    char s[10000];
    int t;
    scanf("%d",&t);
    for (int i = 0; i < t; i++){
        scanf("%s", s);
        printEvenIndexChar(s);
        printf(" ");
        printOddIndexChar(s);
        printf("\n");
    }
    return 0;
}