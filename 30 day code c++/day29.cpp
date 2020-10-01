#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin>>t;
    while(t--){
        int n,k;
        cin>>n>>k;
        vector<int> v(n);
        int ans=0;
        iota(v.begin(),v.end(),1);
        for(int i=0; i<v.size(); i++)
            for(int j=i+1; j<v.size(); j++){
                auto m = max(ans,v[i]&v[j]);
                ans = m< k ? m : ans;
            }
        cout<<ans<<endl;

    }
    return 0;
}
