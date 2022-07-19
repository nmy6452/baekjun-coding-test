#include <iostream>
using namespace std;
int Check_Array(int students, int m, int arr[]);

int main()
{
	int testcase;
	cin >> testcase;

	for (int i = 0; i < testcase; i++)
	{
		int students;
		int ID[300];
		int m = 1;

		cin >> students;

		for (int i = 0; i < students; i++)
		{
			cin >> ID[i];
		}

		while (true)
		{
			int mulID[300];
			for (int i = 0; i < students; i++)
			{
				mulID[i] = ID[i] % m;
			}

			if (Check_Array(students, m, mulID))//중복된값이 있는지 없는지 알아보고 있을경우 m값을 증가시키고 없을경우 반복문을 빠져나감
			{
				break;
			}
			m++;
		}
		
		cout << m << "\n";
	}
}

int Check_Array(int students, int m, int arr[])
{
	if (students == 1)
	{
		return 1;
	}

	for (int i = 0; i < students; i++)
	{
		for (int j = i + 1; j < students; j++)
		{
			if (arr[i] == arr[j])
			{
				return 0;
			}
		}
	}
	return 1;
}
