#include <iostream>
using namespace std;

int main() {
	int result = 0;

	for (int i = 0; i < 5; i++)
	{
		int temp;
		cin >> temp;
		result += temp * temp;
	}
	result = result%10;
	cout << result;
}