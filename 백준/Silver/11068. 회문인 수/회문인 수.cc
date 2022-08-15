#include <iostream>
#include <string>
using namespace std;
string base(int a, int b);
bool rev(int num);

int main() {
	int T;
	cin >> T;

	for (int i = 0; i < T; i++)
	{
		int temp;
		cin >> temp;
		cout << rev(temp) << "\n";
	}
}

string base(int a,int b)
{
	string temp;
	while (a)
	{
		temp.push_back(a % b);
		a = a / b;
	}
	return temp;
}

bool rev(int num)
{
	for (int i = 2; i < 65; i++)
	{
		string temp = base(num, i);
		string temp_rev;

		for(int i = temp.length()-1; i >= 0; i--)
		{
			temp_rev = temp_rev + temp[i];
		}
		if (temp_rev == temp)
		{
			return true;
		}

	}
	return false;
	
}