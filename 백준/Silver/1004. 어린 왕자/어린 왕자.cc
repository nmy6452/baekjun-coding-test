#include <iostream>
#include <cmath>
using namespace std;
typedef struct st_Point
{
	int x;
	int y;
}Point;

typedef struct st_Plenet
{
	Point pos;
	int r;
}Plenet;
int compare(Point a, Plenet b);

int main() {
	int T;
	cin >> T;
	for (int i = 0; i < T; i++)
	{
		Point Start, End;
		int planet_count;
		Plenet planet[50];

		cin >> Start.x >> Start.y >> End.x >> End.y;	//출발점과 도착점을 입력 받는다
		cin >> planet_count;	//행성의 수를 입력받는다
		for (int i = 0; i < planet_count; i++)	//위에서 입력받은 행성수에 맞게 행성을 입력 받는다.
		{
			cin >> planet[i].pos.x >> planet[i].pos.y >> planet[i].r;
		}

		int in = 0;
		for (int i = 0; i < planet_count; i++)
		{

			if (compare(Start, planet[i]) == !compare(End, planet[i])) {
				in++;
			}
		}
		cout << in << "\n";
	}
	return 0;
}

int compare(Point a, Plenet b)
{
	if (pow(a.x - b.pos.x,2) + pow(a.y - b.pos.y, 2) < pow(b.r,2))
	{
		return 1;
	}
	else
	{
		return 0;
	}
}