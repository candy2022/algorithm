#include <stdio.h>
#include <string.h>
int stack[10001];
int count = 0;
void push(int x) { //정수 x를 스택에 넣는 연산
	stack[count] = x;
	count++;
}
void pop() { // 스택에서 가장 위에 있는 정수를빼고 그 수를 출력
	if (count != 0) {
		count--;
		printf("%d\n", stack[count]);
		stack[count] = 0;
	}
	else//스택에 들어있는 정수가 없으면 -1출력
		printf("-1\n");

}
void size() { //스택에 들어있는 정수의 개수 출력
	printf("%d\n", count);
}
void empty() { //스택이 비어있으면 1, 아니면 0 출력
	if (count == 0)
		printf("%d\n",1);
	else
		printf("%d\n",0);

}
void top() { //스택의 가장위에 있는 정수 출력
	if (count > 0) {
		printf("%d\n", stack[count-1]);
	}
	else //스택이 비어있으면 -1 출력
		printf("-1\n");
}
int main() {
	int n,x;
	scanf("%d", &n);
	char commend[10];
	for (int i = 0; i < n; i++) {

		scanf("%s", commend); 

		if (!strcmp(commend, "push")) {

			scanf("%d", &x);
			push(x);
		}
		else if (!strcmp(commend, "pop")) {
			pop();
		}
		else if (!strcmp(commend, "empty")) {
			empty();
		}
		else if (!strcmp(commend, "size")) {
			size();
		}
		else if (!strcmp(commend, "top")) {
			top();
		}
		else
			break;
	}
	return 0;
}
