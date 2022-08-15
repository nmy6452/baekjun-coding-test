#include <iostream>
using namespace std;

int main() {
	int N;
	cin >> N;

	int temp = N / 5;
	for (int i = temp; i >= 0; i--)
	{
		int a = N - (i*5);
		if (a==0)
		{
			cout << i;
			return 0;
		}
		else if (a%2 == 0)
		{
			cout << (a / 2) + i;
			return 0;
		}
	}
	cout << -1;
	return 0;
}
