#include <iostream>
using namespace std;

long long fibo_DP(int a);
long long fibo_arr[91] = {0,1,0 };

int main()
{
    int N;
    cin  >> N;
	cout << fibo_DP(N);
	return 0;
}

long long fibo_DP(int a)
{
	if (a == 0 || a == 1)
	{
		return a;
	}
	else if (fibo_arr[a])
	{
		return fibo_arr[a];
	}
	else
	{
		fibo_arr[a] = fibo_DP(a - 1) + fibo_DP(a - 2);
		return fibo_arr[a];
	}
}