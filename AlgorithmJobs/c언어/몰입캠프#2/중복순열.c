#include <stdio.h>
#include <stdbool.h>

static int m ,n;
static int arr[1000];
static bool visited[1000];
int main() {


	scanf("%d%d", &n, &m);


	recur(0);
}

void recur(int cur) {
	

	if (cur == n) {  
		for (int i = 0; i < n; i++) {
			printf("%d", arr[i]);
		}
		printf("\n");

		return;
	}

	
	
	for (int i = 0; i < m; i++) {
		if (visited[i])continue;
		arr[cur] = i; // i를 넣었다면
		visited[i] = true; // i는 true일 것이다
		recur(cur + 1);
		visited[i] = false; // (cur +1)에 true는 의미없게
	}
}
