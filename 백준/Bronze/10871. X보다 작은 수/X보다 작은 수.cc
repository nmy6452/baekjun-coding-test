#include <stdio.h>
#include<stdlib.h>
int main() {
	int length, Num;
	scanf("%d %d", &length, &Num);

	int* array;
	array = (int*)malloc(length * sizeof(int));


	for (int i = 0; i < length; i++)
	{
		scanf("%d", &array[i]);
	}


	for (int i = 0; i < length; i++)
	{
		if (Num >  array[i])
		{
			printf("%d ",array[i]);
		}
	}
	free(array);
	return 0;
}