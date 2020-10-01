#include <bits/stdc++.h>
using namespace std;
int main()
{
    string S;
    cin >> S;
    try
    {
        int n = stoi(S);
        cout << n << endl;
    }
    catch (exception a)
    {
        cout << "Bad String";
    }
    return 0;
}