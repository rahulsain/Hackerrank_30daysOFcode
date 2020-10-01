#include <bits/stdc++.h>

using namespace std;

// Complete the factorial function below.
int factorial(int n) {
int fact=1;
while(n>0){
fact=fact*n;
n--;
} return fact;
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    int n;
    cin >> n;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    int result = factorial(n);

    fout << result << "\n";

    fout.close();

    return 0;
}
