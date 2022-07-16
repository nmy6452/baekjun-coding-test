#include <stdio.h>
#include<stdlib.h>
int main() {
	int max = 0;
	int loc;
	int* array;
	array = (int*)malloc(9 * sizeof(int));


	for (int i = 0; i < 9; i++)
	{
		scanf("%d", &array[i]);
	}


	for (int i = 0; i < 9; i++)
	{
		if (max < array[i])
		{
			max = array[i];
			loc = i+1;
		}
	}
	free(array);
	printf("%d\n%d", max, loc);
	return 0;
}