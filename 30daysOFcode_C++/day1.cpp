#include <iostream>
#include <iomanip>
#include <limits>

using namespace std;

int main() {
    int i = 4;
    double d = 4.0;
    string s = "HackerRank ";
int j=0,sum1; double e,sum2=0.0; string t,sum3=""; 
    
    // Declare second integer, double, and String variables.
    cin>>j>>e;
 cin.ignore(); getline(cin, t);
    // Read and save an integer, double, and String to your variables.
    // Note: If you have trouble reading the entire string, please go back and review the Tutorial closely.
    sum1=i+j;
    printf("%d\n",sum1);
    sum2=d+e;
    // Print the sum of both integer variables on a new line.
    cout<<fixed<<setprecision(1)<<sum2<<"\n";
    sum3=s+t;
    // Print the sum of the double variables on a new line.
    cout<<sum3;
    // Concatenate and print the String variables on a new line
    // The 's' variable above should be printed first.

    return 0;}