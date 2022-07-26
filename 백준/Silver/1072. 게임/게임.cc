#include <iostream>
using namespace std;


int main() {
	long long X, Y;
	int Z, N = 0;
	cin >> X >> Y;
	Z = (Y * 100) / X;

	if (Z >= 99)
	{
		cout << "-1";
		return 0;
	}

	int MIN = 0;
	int MAX = 1000000000;
	int result = -1;

	while (MIN <= MAX)
	{
		N = (MAX+MIN) / 2;
		int temp = ((Y + N) * 100) / (X + N);

		if (temp <= Z)
		{
			result = N + 1;
			MIN = N + 1;
		}
		else
		{
			MAX = N - 1;
		}
	}

	cout << result;
	return 0;
}