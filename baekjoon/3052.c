#include <stdio.h>
int main() {
	int i = 0, j = 0;
	int a = 0 ,c = 0;
	int b[10] = { 0 };
	while (i < 10) {
		scanf("%d",&a);
		b[i] = a % 42;
		
		for (j = 0; j <= i; j++) {
			if (b[i] == b[j] && i != j) {
				c--;
				break;
			}
		}
		
		c++;
		i++;
	}	
	printf("%d", c);
	return 0;
}
