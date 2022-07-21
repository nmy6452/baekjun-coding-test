#include <iostream>
using namespace std;
long long fiboarr[50] = {0,1,};

long long fibonacci(int n) {
	if (n == 0 || n == 1) {
	}
	else if (fiboarr[n] == 0)
	{
		fiboarr[n] = fibonacci(n - 1) + fibonacci(n - 2);
	}
return fiboarr[n];
}

int main()
{
	int testcase;
	int fib;

	cin >> testcase;

	for (int i = 0; i < testcase; i++)
	{
		cin >> fib;
		if (fib == 0)
			cout << "1 0" << '\n';
		else
		{
			cout << fibonacci(fib - 1) << " " << fibonacci(fib) << "\n";
		}

	}
	return 0;
}