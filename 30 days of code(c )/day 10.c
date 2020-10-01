// DAY 10

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a,b;

    
    scanf("%d", &a);

    while(a!=0)
    {
        b=a%2;
        a=a/2;
        printf("%d", b);
    }
    return 0;
}
