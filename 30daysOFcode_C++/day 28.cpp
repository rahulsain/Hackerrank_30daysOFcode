#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin>>t;
    vector<string> vs;
    while(t--){
        string name,email;
        cin>>name>>email;
        if(email.find("@gmail.com")!= string::npos)
            vs.push_back(name);
    }
    sort(vs.begin(),vs.end());
    for(auto c : vs)
        cout<<c<<endl;
    return 0;
}
