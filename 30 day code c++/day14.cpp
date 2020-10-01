#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

class Difference {
    private:
    vector<int> elements;
  
  	public:
  	int maximumDifference;

	// Add your code here
Difference(vector<int> a )
{
elements = a;
}
void computeDifference(){
 short int i, max = 0, min = 101;
        for(i = 0; i < elements.size(); ++i)
            max = elements[i] > max ? elements[i] : max;
        for(i = 0; i < elements.size(); ++i)
            min = elements[i] < min ? elements[i] : min;
        maximumDifference = max - min;
}
}; // End of Difference class

int main() {
    int N;
    cin >> N;
    
    vector<int> a;
    
    for (int i = 0; i < N; i++) {
        int e;
        cin >> e;
        
        a.push_back(e);
    }
    
    Difference d(a);
    
    d.computeDifference();
    
    cout << d.maximumDifference;
    
    return 0;
}
