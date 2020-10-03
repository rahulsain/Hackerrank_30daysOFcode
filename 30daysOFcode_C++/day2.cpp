#include <bits/stdc++.h>

using namespace std;

// Complete the solve function below.
void solve(double meal_cost, int tip_percent, int tax_percent) {
    double tip, tax, totalCost;
    /*
    As the constraints are not mentioned
    it is safe to use double instead of
    float to be on the safe side.
    Float->4 bytes
    Double->8 bytes
    */
    tip = meal_cost * tip_percent/100;
    tax = meal_cost * tax_percent/100;
    totalCost = meal_cost + tip + tax;
    /*
    The round() function in C++ is used 
    to round off the double, float or long
    double value passed to it as a parameter
    to the nearest integral value.
    */
    cout << round(totalCost);
}

int main()
{
    double meal_cost;
    cin >> meal_cost;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    int tip_percent;
    cin >> tip_percent;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    int tax_percent;
    cin >> tax_percent;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    solve(meal_cost, tip_percent, tax_percent);

    return 0;
}

