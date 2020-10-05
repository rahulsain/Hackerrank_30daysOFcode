#include<iostream>
using namespace std;

int main() {
    int n;
    cin >> n;
    if(n%2 != 0) {
    	cout << "Weird";	
	}
	else if(n%2 ==0 && (n>=6 && n<=20)){
		cout << "Weird";
	}
    else if(n>20 && n%2==0){
    	cout << "Not Weird";	
	}
	else if(n%2==0 && n<=5 && n>=2 ){
		cout << "Not Weird";
	}
    return 0;
}
