#include<iostream>
using namespace std;
int gcd(int i, int j)
{
  int aa;
  if(j==0)
  {
    printf("%d",i);
  }
  else
  {
    aa=i%j;
    return gcd(j,aa);
  }
}
int main()
{
	int a,b;
	scanf("%d %d",&a,&b);
	gcd(a,b);
}
