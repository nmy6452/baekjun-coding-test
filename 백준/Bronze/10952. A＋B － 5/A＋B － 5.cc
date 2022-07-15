#include <stdio.h>
#include<stdlib.h>
int main() {
	while (1)
	{
		int a, b;
		scanf("%d %d", &a, &b);
		if (a || b)
		{
			printf("%d\n", a + b);
		}
		else
		{
			break;
		}
	}
	return 0;
}