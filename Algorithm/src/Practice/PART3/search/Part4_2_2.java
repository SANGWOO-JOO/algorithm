package Practice.PART3.search;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Part4_2_2 {


	public static void main(String[] args) {
        int [][]arr=new int[40][40];
		
		Scanner sc = new Scanner(System.in);
		int r,c;
		c=sc.nextInt(); //가로 
		r=sc.nextInt(); //세로
		
		int ans; //출력할 최대 점수	
		int idx; //출력할 그때의 좌표 
		int zero;
		int score; //그때의 점수
		int cnt;  // 그때의 메워진 수평선 개수	
		
		for(int i=0;i<=r+1;i++) {
			for(int j=1;j<=c;j++) {
				arr[0][j]=1;
				arr[r+1][j]=1;
			}
		}
		
		
		
		//주어진 c(가로)와 r(세로)값에 따라 대입 => 초기 테트리스 구성
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		/*
		 * 막대가 j번 떨어진다 할 떄, y값 어디에 떨어지는지 zero라는 변수에 저장한다.
		 */
		
		ans=0; //출력할 최대 점수	
		idx=0; //출력할 그때의 좌표 
		zero=0;
		for(int j=1;j<=c;j++) {
			int[] isValidLocation = new int[c];
			for(int i=1;i<=r;i++) {
				idx++; // 반복하는 만큼 y축 값이 증가
				if(arr[i][j]==1) {
					isValidLocation[j]=idx-1;
					break;
				}
			}
				System.out.print(isValidLocation[j] + " ");
				idx=0;
		}
		
	
		
		/*
		 * 위에서 구한 j번째 열에 막대를 놓는데 놓을 수 없으면 넘어간다.
		 */
		
		/*
		 * 막대를 두고나서, 전체 판을 탐색하면서 점수를 계산한다.
		 */
		score= 0;
		for(int i=1;i<=r;i++) {
			cnt=0;
			for(int k=1;k<=c;k++) {
				if(arr[i][k]==1)cnt++;
			}
			if(cnt == c) {
				score++;
			}
		}
		
		/*
		 * 지금까지의 점수보다 지금 위치의 점수가 더 크면 점수와 인덱스를 갱신
		 */
		
		if(ans<score) {
			ans=score; // 최대값
			idx=0; //출력할 그때의 좌표 
		}
//		System.out.print(idx +" " + ans);
	}
}
