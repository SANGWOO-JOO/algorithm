package binary_search;

import java.util.*;

public class Part7_4_2_BinarySearch_나무자르기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 나무 개수
		int M = sc.nextInt(); // 절단 길이
		
		ArrayList<Integer> listTree = new ArrayList<Integer>();
		
		for(int i=0;i<N;i++) {
			int treeHeight =sc.nextInt();
			listTree.add(treeHeight);
		}
//		listTree.sort(null); //sort(null)은 sort(Comparator.naturalOrder()와 같다. 
		listTree.sort(Comparator.naturalOrder()); //오름차순으로 정렬
		
		long first =0;
		long last = 2000000000;
		long mid=0;
		/*
		 * 이진 탐색
		 */
		while(first<=last) {
			mid = (first+last)/2;
			long sumTree= 0;
			
			for(int i=0;i<N;i++) {
				long cut =listTree.get(i)-mid;
				if(cut<=0)continue;
				sumTree +=cut;
			}
			
			if(sumTree>=M) {
				first=mid+1;
			}
			else last =mid -1;
		}
		System.out.print(first-1);

	}

}
