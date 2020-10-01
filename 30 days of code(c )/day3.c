#include<stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
if(n%2!=0)
    printf("Weird");
if(n%2==0)
{
    if(n>=2 && n<=5)
    printf("Not Weird");
    if(n>=6 && n<=20)
    printf("Weird");
if(n>20) 
printf("Not Weird");
}
return 0;
}
