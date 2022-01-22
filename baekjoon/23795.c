#include <stdio.h>
int main() {
	int n;
	int sum=0;
	while (1) {		
		scanf("%d", &n);
		if (n == -1)
			break;
		else
			sum += n;
	}	
	printf("%d", sum );	
}
