#include <stdio.h>
int main(void) {
		
	int b = 1,i = 1;
	int num;
	scanf("%d", &num);
	while (i < num) {
		i += b * 6;
		b++;
	}	

	printf("%d",b);
	return 0;
}
