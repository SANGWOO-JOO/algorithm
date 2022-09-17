package Basic_Datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class sort_array_in_reverse {

	
	class ReverseArray{
		
		static void swap(int[]a, int idx1, int idx2) {
			int t=a[idx1];
			a[idx1]=a[idx2];
			a[idx2]=t;
		}
		
		static void reverse(int[]a) {
			for(int i=0;i<a.length/2;i++){
				swap(a,i,a.length-i-1);
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수: ");

		int num =sc.nextInt();
		
		int[]x =new int[num]; // 요솟수가 num인 배열
		
		
		for(int i=0;i<num;i++) {
			System.out.print("x["+i+"]:");
			x[i] =sc.nextInt();
		}
		/*
		 * 메서드 reverse는 매개변수로 전달받은 배열 요소를 역순으로 정렬
		 * 
		 */
		
		ReverseArray.reverse(x);
		
		System.out.print("요소를 역순을오 정렬");
		System.out.print("x="+Arrays.toString(x));
	}

}
