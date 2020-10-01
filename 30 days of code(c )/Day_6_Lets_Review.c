#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

void string(){
    int i = 0;
    char str[10000];
    scanf("%s",&str);
    char even[5000], odd[5000];
    for(i; i < strlen(str) ; i++){
        if(i % 2 == 0)
            even[i/2] = str[i];
        else
            odd[(i - 1) / 2] = str[i];
    }
    printf("%s %s \n",even,odd);
}


int main() {
    int n;
    scanf("%d",&n);
    while(n-- > 0){
        string();
    } 
    return 0;
}
