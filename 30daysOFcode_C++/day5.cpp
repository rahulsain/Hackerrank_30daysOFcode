#include <bits/stdc++.h>

using namespace std;



int main()
{
    int n,result;
    cin >> n;
    //this is a simple code to print the table of n
    cin.ignore(numeric_limits<streamsize>::max(), '\n');
    for(int i=1;i<11;i++)
   {
      result=n*i;
     printf("%d x %d = %d\n",n,i,result);
   }  return 0;
}
