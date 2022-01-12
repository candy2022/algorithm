#include <stdio.h>
int main(void) {
		
	int N[10];
	int i;
	int c = 0,I = 0;
	
	for (i = 0; i < 9; i++) {
		scanf("%d", &N[i]);
		if (N[i] > c) {
			c = N[i];
			I = i;
		}		
	}

	printf("%d\n%d",c,I+1);
	return 0;
}
