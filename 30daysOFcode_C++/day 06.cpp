#include<iostream>
#include<string.h>
using namespace std;
int main(){
	string s;
	int i, n;
	cin >> n;
	while(n--){
		cin >> s;
		for(i=0;i<s.length();i=i+2){
			cout << s[i] << "";
		}
		cout << " ";
		for(i=1;i<s.length();i=i+2){
			cout << s[i] << "";
		}
		cout << "\n";	
	}
	return 0;
}
