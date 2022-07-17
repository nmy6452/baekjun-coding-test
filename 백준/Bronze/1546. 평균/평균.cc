#include <stdio.h>
#include<stdlib.h>
int main() {
	int length = 0, max = 0, temp;
	float avr = 0;


	scanf("%d", &length);

	for (int i = 0; i < length; i++)
	{
		scanf("%d", &temp);
		max = (max > temp) ? max : temp;
		avr += temp;
	}
	
	avr = (avr/max*100) /length;
	printf("%f", avr);

	return 0;
}