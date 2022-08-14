#include <iostream>
#include <string>
using namespace std;
const int MIN = 2;
const int MAX = 64;
bool isPalindrome(int N)
{
    for (int b = MIN; b <= MAX; b++)
    {
        int num = N;
        string s;
        while (num)
        {
            s.push_back(num % b);
            num /= b;
        }
        string reverseS;
        for (int i = s.length() - 1; i >= 0; i--)
        {
            reverseS += s[i];
        }
        if (s == reverseS)
        {
            return true;
        }
    }
    return false;
}

int main(void)
{
    int T;
    cin >> T;
    for (int t = 0; t < T; t++)
    {
        int N;
        cin >> N;
        cout << isPalindrome(N) << "\n";
    }
    return 0;
}