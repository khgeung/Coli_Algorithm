#include<stdio.h>


int main(void)
{
	
	int a = 0, b = 0, c = 0;
	int n = 0;
	int sum = 0;

	int T[100];

	scanf("%d", &a);

	for (int i = 0; i < a; i++) {

		scanf("%d", &b);
		T[i] = b;

	}

	scanf("%d", &c);


	for (int i = 0; i < a; i++) {

		if (T[i] == c) {
			n++;
		}
		else
			continue;

	}

	printf("%d", n);
}