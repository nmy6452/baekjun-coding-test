#include <iostream>
using namespace std;

int main()
{
	int input;
	cin >> input;

	for (int i = 0; i < input; i++)
	{
		int a, b;
		cin >> a >> b;

		long long temp = 1;
		int r = 1;

		for (int i = b; i > b - a; i--)
		{
			temp = temp * i;
			temp = temp / r;
			r++;
		}

		cout << temp << "\n";
	}
}