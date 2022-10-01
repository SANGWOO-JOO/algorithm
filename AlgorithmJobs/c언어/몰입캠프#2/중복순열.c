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
		arr[cur] = i; // i�� �־��ٸ�
		visited[i] = true; // i�� true�� ���̴�
		recur(cur + 1);
		visited[i] = false; // (cur +1)�� true�� �ǹ̾���
	}
}
