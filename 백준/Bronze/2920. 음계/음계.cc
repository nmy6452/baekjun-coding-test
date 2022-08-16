#include <iostream>
#include <string>
using namespace std;

int main() {
	int A[10] = {0};
	string str;

	for (int i = 1; i <= 8; i++)
	{
		string temp;
		cin >> temp;
		str.append(temp);
	}
	if (str == "12345678")
	{
		cout << "ascending";
	}
	else if (str == "87654321")
	{
		cout << "descending";
	}
	else
	{
		cout << "mixed";
	}
}
