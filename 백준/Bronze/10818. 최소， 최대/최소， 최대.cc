#include <stdio.h>
#include<stdlib.h>
#define INF 10000000;
int main() {
	int length;
	int min = INF;
	int max = -1000000;
	scanf("%d", &length);

	int* array;
	array = (int*)malloc(length * sizeof(int));


	for (int i = 0; i < length; i++)
	{
		scanf("%d", &array[i]);
	}


	for (int i = 0; i < length; i++)
	{
		if (min > array[i])
		{
			min = array[i];
		}
		if (max < array[i])
		{
			max = array[i];
		}
	}
	free(array);
	printf("%d %d", min, max);
	return 0;
}