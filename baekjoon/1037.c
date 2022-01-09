#include <stdio.h>
int main(void) {
	int a, i;
	int n[100];
	int min;
	int max;
	scanf("%d",&a);
	for (i = 0; i < a; i++) {
		scanf("%d", &n[i]);
	}
	min = max = n[0];
	for (i = 0; i < a; i++) {
		if (min > n[i]) {
			min = n[i];
		}
		if (max < n[i]) {
			max = n[i];
		}
	}		
	printf("%d",min*max);	
}
