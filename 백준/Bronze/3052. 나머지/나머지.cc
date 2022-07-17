#include <stdio.h>
#include<stdlib.h>
int main() {
	int count = 0;
	int array[10];

	for (int i = 0; i < 10; i++)
	{
		scanf("%d", &array[i]);
		for (int j = 0; j < i; j++)
		{
			if ((array[j] % 42) == (array[i] % 42)){
				count--;
				break;
			}
		}
		count++;
	}
	printf("%d", count);
	return 0;
}