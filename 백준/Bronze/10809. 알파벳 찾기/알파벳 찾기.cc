#include <iostream>
using namespace std;

int alphabet(char text[], int a);
int main()
{
	char text[101];

	cin >> text;

	for (int i = 0; i < 26; i++)
	{
		cout << alphabet(text, i) << " ";

	}
	return 0;
}

int alphabet(char text[], int a)
{
	int j = 0;
	while (text[j] != '\0')
	{
		if ('a' + a == text[j])
		{
			return j;
		}
		j++;
	}
	return -1;
}