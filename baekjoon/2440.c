#include <stdio.h>
int main(void) {
		
	int N;
	int j,i;
	scanf("%d", & N);
	for (i = 0; i < N; i++) {
		for (j = N; j > i; j--) {
			printf("*");
		}
		printf("\n");
	}

	return 0;
}
