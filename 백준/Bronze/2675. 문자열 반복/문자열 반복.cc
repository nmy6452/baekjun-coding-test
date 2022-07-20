#include <iostream>
using namespace std;
void repeat_text(char text[], int a);

int main()
{
	int testcase, repeat;
	char text[21];

	cin >> testcase;

	for (int i = 0; i < testcase; i++)
	{
		cin >> repeat >> text;
		repeat_text(text, repeat);
	}
	return 0;
}

void repeat_text(char text[], int a)
{
	int j = 0;
	while (text[j] != '\0')
	{
		for (int i = 0; i < a; i++)
		{
			cout << text[j];
		}
		j++;
	}
	cout << "\n";
}