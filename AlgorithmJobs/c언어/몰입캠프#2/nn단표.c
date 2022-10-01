#include <stdio.h>

int n;
long long int k;
int getOrder(long long int x) {

	int result = 0;
	for (int i = 1; i <= n; i++) {
		if (i * n < x)result += n; // n보다 작을 때 
		else {
			if (x % i == 0) result += (x / i) - 1;
			else result += x / i;
		}
	}
	return result + 1;
}

int main() {
	
	scanf("%d", &n);
	scanf("%lld", &k);

	// 1~ n*n 
	// 숫자 p가 몇번째 인가?

	long long start = 1, end = n * n + 1;

	while (start + 1 < end) {
		// start : 항상 정답이 되는 숫자보다 작거나 같은 순서를 가지는 숫자
		// end : 항상 정답이 되는 숫자보다 큰 숫자
		
		long long  mid = (int)(start + end)/ 2; // 중간값
		long long  myOrder = getOrder(mid);  

		

		if (myOrder <= k) start = mid; 
		else end = mid;
		}

	printf("%d\n", start);

	return 0;
}
