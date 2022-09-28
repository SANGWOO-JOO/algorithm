#include <stdio.h>

int binarySearch(int arr[], int mystart, int myend, int value) {
	/*
		arr의 mystart부터 myend 까지 중에서
		value를 찾아 그 위치를 반환하는 함수
		만약, 없다면 -1을 반환한다.
	*/
	 
	int start, end;
	int mid;
	
	if (arr[mystart] > value) {
		return -1;
	}
	if (arr[end] < value) {
		return -1;
	}

	 //Binary Search 준비

	start = mystart;
	end = myend;

	// value 10
	while (start+1<end) {
		mid = (start + end) / 2;

		if (arr[mid] == value)return mid; 
		
		else if (arr[mid] > value) {
			end = mid;
		}
		else {
			start = mid;
		}

		//start / end 붙어 있을떄 

		
	}
	


}

int main() {

	int n, m;
	int arr[100];

	scanf("%d", &n);

	for (int j = 0; j < n; j++) {

		scanf("%d", &arr[i]);
	}
	scanf("%d", &m);

	int inx = binarySearch(arr, 0, n - 1, m);

	if (inx == -1) {
		printf("수를 찾을 수 없습니다");
	}
	else {
		printf("%d 번째의 값입니다.",inx);

	}

	return 0;
}
