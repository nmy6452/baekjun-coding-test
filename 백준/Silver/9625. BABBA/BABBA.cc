#include <iostream>
#include <cmath>
using namespace std;
int BABBA(int a);
int DP[45] = {0,1,1, };

int main() {
	int K;
	cin >> K;
	BABBA(K);
	cout << DP[K-1] << " " << DP[K];
}

int BABBA(int a)
{
	if (DP[a])
	{
		return DP[a];
	}
	else
	{
		DP[a] = BABBA(a - 2) + BABBA(a - 1);
		return DP[a];
	}
}