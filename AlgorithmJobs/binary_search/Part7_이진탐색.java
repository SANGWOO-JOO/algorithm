package binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class Part7_이진탐색 {
	
	static int n,q;
	static int []arr= new int [100010];
	static int []arr2=new int [100010];
	
	private static int binarySearch(int[] arr, int start, int end, int arr2) {
		// TODO Auto-generated method stub
		//전체 조건이 형성되지 않을때
		if (start > end) 
	        return -1;
		// 이진 탐색으로 값 떨어질때 
		else if(start==end) {
				if(arr[start]==arr2)
					return 1;
				else
					return -1;				
			}
		// 이진탐색
		else {
			
			int mid =(start+end)/2;
		
			if(arr[mid]>arr2)
				// 중간값이 찾고자 하는 값이 크다면 mid -1 전까지 재귀함수로 찾아본다.
				  binarySearch(arr, start, mid-1, arr2);
			else 
				if(arr[mid]<arr2) 
				// 중간값이 찾고자 하는 값이 작다면 mid -1 전까지 재귀함수로 찾아본다.
				  binarySearch(arr, mid+1, end, arr2);
			else
				if(arr[mid]==start) 
					return 1;
				else 
					return -1;
		}	
		return 0;
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		n =sc.nextInt(); //전체 질문수 5 
		q=sc.nextInt();  // 확인 해보고 싶은 자연수 3
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt(); //전체 질문수 :: 배열
		}
		
		
		for(int i=0;i<q;i++) {
			arr2[i]=sc.nextInt(); //확인해 보고 싶은 자연수 :; 배열
		}
		
		
		int inx = -1;
		
		for(int i = 0; i < q; i++ ){ // q만큼 돌려본다

			// 이진 탐색 메소드 
			inx = binarySearch(arr, 0, n-1 , arr2[i]);
			
			if(inx == -1) { // 없다
				System.out.print("NO");
				System.out.println();
			}
			else  { // 있다.
				System.out.print("Yes");
				System.out.println();
			}
		}		
	}
}
