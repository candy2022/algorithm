#include <stdio.h>
int main(void) {
		
	int A,B,C,cal;
	int i = 1;
	scanf("%d %d %d", &A,&B,&C);
// 1000 + 70 * 10 = 1700  < 1700
// 1000 + 70 * 11 = 1770  < 1870
// (a + b * i) < c * i;
//   a/i + b < c
//   a/i < c - b
// 	 a < (c - b)i
//  a /c-b < i 
	
	if (B >= C)
		printf("-1");
	else
		printf("%d", A /( C - B )+1);
	return 0;
}
