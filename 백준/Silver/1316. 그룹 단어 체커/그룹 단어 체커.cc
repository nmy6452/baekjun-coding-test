#include <iostream>
using namespace std;
int is_Group(char word[]);
int Is_new_word(char word[], int a);

int main()
{
	int testcase , out = 0;
	char word[100];
	cin >> testcase;

	for (int i = 0; i < testcase; i++)
	{
		cin >> word;

		if (is_Group(word)) //해당 단어가 그룹단어일 경우 카운트를 업
		{
			out++;
		}
	}
	cout << out << "\n";
}

int is_Group(char word[])
{
	if (sizeof(word) / sizeof(char) <= 1) //입력 단어가 한글자일 경우 참을 반환
	{
		return 1;
	}

	int i = 1;
	while (word[i] != '\0')				//단어의 끝을 만날때까지 반복
	{
		if (word[i - 1] == word[i])		//연속된 문자일 경우 다음으로 
		{
			i++;
			continue;
		}
		else							//연속되지 않은 문자를 만날경우
		{
			if (Is_new_word(word, i))	// 해당 문자가 새로운 문자인지 확인
			{
				i++;
				continue;
			}
			else
			{
				return 0;
			}
		}
	}
	return 1;
}

int Is_new_word(char word[], int a)	//이전에 같은 문자가 있었는지 확인
{
	for (int i = 0; i < a; i++)
	{
		if (word[i] == word[a]) //이전에 같은 문자가 있었다면 false
		{
			return 0;
		}
	}
	return 1;	//이전에 같은 문자가 없었다면 true
}
