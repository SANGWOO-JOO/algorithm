#include <stdio.h>

int binarySearch(int arr[], int mystart, int myend, int value) {
	/*
		arr�� mystart���� myend ���� �߿���
		value�� ã�� �� ��ġ�� ��ȯ�ϴ� �Լ�
		����, ���ٸ� -1�� ��ȯ�Ѵ�.
	*/
	 
	int start, end;
	int mid;
	
	if (arr[mystart] > value) {
		return -1;
	}
	if (arr[end] < value) {
		return -1;
	}

	 //Binary Search �غ�

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

		//start / end �پ� ������ 

		
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
		printf("���� ã�� �� �����ϴ�");
	}
	else {
		printf("%d ��°�� ���Դϴ�.",inx);

	}

	return 0;
}
