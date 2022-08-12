#include <iostream>
#include <cmath>
using namespace std;

int main() {
	int N;
	cin >> N;

	if (N%5 == 0)
	{
		cout << N / 5;
		return 0;
	}
	else
	{
		int temp = N / 5;
		for (int i = N / 5; i >= 0; i--)
		{
			int a = N - (i * 5);
			if (a%3 == 0)
			{
				cout << i + a/3;
				return 0;
			}
		}
		cout << -1;
		return 0;
	}
}