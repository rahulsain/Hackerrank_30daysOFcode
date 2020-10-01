#include <bits/stdc++.h>

using namespace std;



int main()
{
    int n;
    cin >> n;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');
    if(n%2!=0||(n%2==0&& n>=6 && n<=20))
    printf("Weird");
    else if((n%2==0&& n<=5 &&n>=2 )|| n>20)
    printf("Not Weird");
    return 0;
}
