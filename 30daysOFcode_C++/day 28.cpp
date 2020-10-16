#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin>>t;
    vector<string> vs;
    while(t--){
        string name,email;
        cin>>name>>email;
        /*
        The C++ function find() finds the first occurrence of the element.
        Here string::npos means not found.
        It is usually defined like so:
        static const size_t npos = -1;
        It is better to compare to npos instead of -1
        because the code is more legible.
        So here we are checking whether the email contains
        "@gmail.com" if yes, then push the email to the
        vector.
        */
        if(email.find("@gmail.com")!= string::npos)
            vs.push_back(name);
    }
    // Sorts the vector in ascending order
    sort(vs.begin(),vs.end());
    // Printing all the elements using forEach loop
    for(auto c : vs)
        cout<<c<<endl;
    return 0;
}