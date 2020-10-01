#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

// this is a simple code to print the string
int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n,i,j,t;
    cin>>t;
    for(i=0;i<t;i++)
    {
   string s;
   cin>>s;
   string s1,s2;
    for(j=0;j<s.size();j++)
    {
        if(j%2==0)
        {
            s1+=s[j];
        }
        else
        {
            s2+=s[j];
        }
    }    
    cout<<s1<<" "<<s2<<"\n";
    }
    return 0;
}
