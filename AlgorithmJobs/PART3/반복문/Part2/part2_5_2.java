package Practice.part2;

import java.util.Scanner;

public class part2_5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		int n; 
		int arr[][]=new int[100][100];
		int i ,j; //y,x 좌표 인덱스
		int cnt=1;
		
		n = sc.nextInt();
		int y,x;
		
		for(i=0;i<n;i++) {
			y=0;
			x=i;
			for(j=0;j<=i;j++) {
				arr[y][x]=cnt;
				cnt++;
				y++;
				x--;
			}
		}
		
		for(i=0;i<n;i++) {
			for(j=0;j<n-i;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}
