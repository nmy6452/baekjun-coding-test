#include <iostream>
using namespace std;

long long f[50] = {0,1,1,2};

int main()
{
    int N;
    cin >> N;

    for (int i = 3; i < N+1; i++)
    {
        f[i] = f[i - 1] + f[i - 2];
    }

    cout << f[N] << " " << N-2;

    return 0;
}