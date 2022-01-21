#include <stdio.h>
int main() {
	int x, y, w, h;
	int min;
	scanf("%d %d %d %d", &x, &y, &w, &h);
	min = (x < y) ? x: y;
	min = (min < w - x) ? min : w - x;
	min = (min < h - y) ? min : h - y;
	printf("%d",min );
	
}
