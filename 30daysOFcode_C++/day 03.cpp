#include<iostream>
using namespace std;

int main()
{
    int N;
    cin >> N;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');
    if( N%2 == 1 || (N > 5 && N < 21)){
        cout<<"Weird"<<endl;
    }
   else{
       cout<<"Not Weird"<<endl;
   }
	return 0;
}
