#include<iostream>
using namespace std;
int main(){
    int i, n; //Variable Declaration
    cin >> n;
    int arr[n]; //Array Delcaration
    for(i=0;i<n;i++){
        cin >> arr[i]; //Inputting Elements Into The Array
    }
    for(i=n-1;i>=0;i--){
        cout << arr[i] << " "; //Outputting The Elements In Reverse Order
    }
    return 0;
}
