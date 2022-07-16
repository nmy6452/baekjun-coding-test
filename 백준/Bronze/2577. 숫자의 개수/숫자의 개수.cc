#include <stdio.h>
#include<stdlib.h>
int main() {
	int mul;
	int a,b,c;
	int array[10];

	scanf("%d", &a);
	scanf("%d", &b);
	scanf("%d", &c);

	mul = a * b  * c;

	for (int i = 0; i < 10; i++)
	{
		array[i] = 0;
	}

	while (mul)
	{
		++array[mul % 10];
		mul = mul / 10;
	}
	for (int i = 0; i < 10; i++)
	{
		printf("%d\n", array[i]);
	}
	return 0;
}