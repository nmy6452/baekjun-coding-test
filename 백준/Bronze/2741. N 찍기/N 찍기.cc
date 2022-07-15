#include <stdio.h>
int main() {
	int a;
	int b = 1;
	scanf("%d",&a);
	for (int i = 0; i < a; i++)
	{
		printf("%d\n", b);
		b++;
	}
}