#include <iostream>
using namespace std;

int N, ans;
int num[1000000];
int DP[1000000];

int main()
{
    cin >> N;
	for (int i = 0; i < N; i++)
	{
		cin >> num[i];
	}
	ans = num[0];

	DP[0] = num[0];
	for (int i = 1; i < N; i++)
	{
		DP[i] = num[i];
		if (DP[i] < DP[i - 1] + num[i])
		{
			DP[i] = DP[i - 1] + num[i];
		}
		if (DP[i] > ans)
		{
			ans = DP[i];
		}
	}

	cout << ans;
    return 0;
}