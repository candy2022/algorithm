#include <stdio.h>
int main() {
	int n = 0,a=0,b=0;
	int i;
	scanf("%d", &n);

	for (i = 1; i < n+1; i++) {
		scanf("%d %d", &a, &b);
		printf("Case #%d: %d + %d = %d\n",i,a,b,a+b);
	}
	return 0;
}
