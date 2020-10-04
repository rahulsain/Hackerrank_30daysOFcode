#include <iostream>
#include <iomanip>
#include <limits>

using namespace std;

int main() 
{
    int i = 4;
    double d = 4.0;
    string s = "HackerRank ";

    // Declare second integer, double, and String variables.
    int j = 0, sum1; 
    double e, sum2 = 0.0; 
    string t, sum3 = ""; 
    
    // Read and save an integer, double, and String to your variables.
    // Note: If you have trouble reading the entire string, please go back and review the Tutorial closely.
    cin >> j >> e;
    cin.ignore(); 
    getline(cin, t);
    
    // Print the sum of both integer variables on a new line.
    sum1 = i + j;
    printf("%d\n", sum1);

    // Print the sum of the double variables on a new line.
    sum2 = d +e ;
    cout << fixed << setprecision(1) << sum2 << "\n";
    
    // Concatenate and print the String variables on a new line
    // The 's' variable above should be printed first.
    sum3 = s + t;
    cout << sum3;

    return 0;
}