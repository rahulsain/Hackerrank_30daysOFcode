#include <bits/stdc++.h>

using namespace std;



String main()
{
    int n;
    cin >> n;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');
    if(n%2!=0||(n%2==0&& n>=6 && n<=20))
    printf("weird");
    else if((n%2==0&& n<=5 &&n>=2 )|| n>20))
    printf("Not weird");
    return "0";
}
