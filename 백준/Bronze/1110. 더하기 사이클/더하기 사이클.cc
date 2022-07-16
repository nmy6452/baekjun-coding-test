#include <stdio.h>
#include<stdlib.h>
int main() {
		int count = 0;
		int num, num1;
		scanf("%d", &num);
		num1 = num;

		while (1)
		{
			int temp;

			temp = ((num1 / 10) + (num1 % 10)) % 10;
			num1 = ((num1 % 10) * 10) + temp;
			++ count;

			if (num == num1)
			{
				printf("%d", count);
				break;
			}
		}
	return 0;
}