#include <iostream>
using namespace std;

int DP[101][1000001];

int main() {
	int N ,K;
	int W[101] = { 0 };
	int V[101] = { 0 };
	cin >> N >> K;

	for (int i = 1; i <= N; i++)
	{
		cin >> W[i] >> V[i];
	}

	for (int i = 1; i <= N; i++)
	{
		for (int j = 1; j <= K; j++)
		{
			if (j >= W[i])
			{
				int a = V[i] + DP[i - 1][j - W[i]];
				int b = DP[i - 1][j];
				DP[i][j] = a > b ? a : b;
			}
			else
			{
				DP[i][j] = DP[i - 1][j];
			}
		}
	}

	cout << DP[N][K];
}
