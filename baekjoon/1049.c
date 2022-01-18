#include <stdio.h>
int main(void) {
		
	int N,M,p,u, r1,r2,r3,min;
	int pack=1000, uno=1000;
	scanf("%d %d", &N, &M);
	for (int i = 0; i < M; i++) {
		scanf("%d %d", &p, &u);
		if (pack > p) pack = p;
		if (uno > u) uno = u;
	}
	//패키지로 살때
	if (N%6 == 0) //6의 배수인 경우 
		r1 = N / 6  * pack;
	else
		r1 = (N / 6 + 1) * pack;
   //낱개로 살때
	r2 = N * uno; 
	//패키지와 낱개 섞어서 살때
	r3 = N / 6 * pack + N % 6 * uno; 

	min = (r1 < r2) ? r1 : r2;
	min = (min < r3) ? min : r3;
	printf("%d",min);
	return 0;
}
