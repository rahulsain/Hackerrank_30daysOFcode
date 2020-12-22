#include<bits/stdc++.h>
#include<vector>
#include<algorithm>
using namespace std;
int hourglass(vector<vector<int>>arr)
{
    int n =arr.size(), o=arr[0].size();
   int max = 0;
   for(int i=0;i<n-2;i++)
   {
       for(int j=0;j<o-2;j++)
       {
           int sum=0;
           for(int x=j;x<=j+2;x++){
               sum += (arr[i][x]+arr[i+2][x]);
           }
           sum += arr[i+1][j+1];
           if(sum>max || i==0 && j==0)max=sum;
       }
   }
   return max;
}


int main(){
vector<vector<int>>arr(6,std::vector<int>(6,0));
for(int i=0;i<6;i++)
{
    for(int j=0;j<6;j++)
    {
        cin>>arr[i][j];
    }
}
cout<<hourglass(arr)<<endl;
return 0;
}
