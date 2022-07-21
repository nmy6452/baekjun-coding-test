#include <iostream>
using namespace std;

int main()
{
	int N;
	int A[51], P[51];

	int countup = 0, i = 0;

	cin >> N;
	for (int i = 0; i < N; i++)
	{
		cin >> A[i];
	}

	for (int i = 0; i < 10000; i++)
	{
		for (int j = 0; j < N; j++)
		{
			if (A[j] == i)
			{
				P[j] = countup;
				countup++;
			}
		}
	}

	for (int i = 0; i < N; i++)
	{
		cout << P[i] << " ";
	}



	return 0;
}