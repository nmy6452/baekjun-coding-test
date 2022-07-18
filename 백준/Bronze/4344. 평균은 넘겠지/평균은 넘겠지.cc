#include <iostream>

using namespace std;
int main() {
	int testcase;

	cin >> testcase;

	for (int i = 0; i < testcase; i++)
	{

		int student;
		int score[1000];
		int Average = 0;
		int temp = 0;

		cin >> student;

		for (int j = 0; j < student; j++)
		{
			cin >> score[j];
			Average += score[j];
		}
		Average = Average / student;
		for (int j = 0; j < student; j++)
		{
			if (score[j] > Average)
			{
				temp++;
			}
		}
		float res = (float)temp / (float)student * 100;
		cout << fixed;
		cout.precision(3);
		cout << res << "%" << endl;
	}


	return 0;
}