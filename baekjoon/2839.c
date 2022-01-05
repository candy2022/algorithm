#include <stdio.h>
int main(void) {
	int a, i=0;	
	int result = 0;
	
	scanf("%d",&a);
	while (1) {
		if (a % 5 == 0) {
			result += a / 5;
			break;
		}
		else {
			a = a - 3;
			result++;
		}
		
		if (a <= 0) break;
		
	}	
	if (a < 0)
		printf("-1");
	else
		printf("%d", result);
	return 0;
}
