#include<iostream>
#include <cmath> 
using namespace std;
int main(){
	float mealCost, tipPercent, taxPercent, totalCost; //Declaration
	cin >> mealCost >> tipPercent >> taxPercent; //Taking The Input
	tipPercent = mealCost * tipPercent/100; //Calculating The Tip Percent
	taxPercent = mealCost * taxPercent/100; //Calculating The Tax Percent
	totalCost = mealCost + tipPercent + taxPercent; // Total Cost
	cout << round(totalCost); // Rounding Up The Cost
	return 0;
}
