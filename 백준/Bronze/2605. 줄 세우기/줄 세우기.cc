#include <iostream>
#include <vector> 
using namespace std;

int main() {
	int N;
	vector<int> arr;

	cin >> N;

	for (int i = 0; i < N; i++)
	{
		int temp;
		cin >> temp;
		arr.insert(arr.begin() + (i-temp), i);
	}

	for (int i = 0; i < N; i++)
	{
		cout << arr[i]+1 << " ";
	}
}