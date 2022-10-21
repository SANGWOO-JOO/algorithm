package Practice.PART3.search;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


//tetris


public class Part4_2_1 {
	
		private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	    public static void main(String[] args) throws IOException {

	        StringTokenizer st = new StringTokenizer(br.readLine());
	        /*
	         * . 두 값의 범위는 5 ≤ C(가로), R ≤ 20(세로)이다
	         */
	        int c = Integer.parseInt(st.nextToken()); 
	        int r = Integer.parseInt(st.nextToken()); 

	        int[][] arr = new int[r+1][c+1];
	        for(int i = 1; i <= r; i++) {
	            st = new StringTokenizer(br.readLine());
	            for(int j = 1; j <= c; j++) {
	                arr[i][j] = Integer.parseInt(st.nextToken());
	            }
	        }

	        /* 
	        테트리미노를 놓을 수 있는 위치를 판단하는 코드
	        - 가장 위에서부터 막대기가 내려오기 때문에 위에서부터 0인 갯수를 카운트
	        - 카운트한 갯수가 테트리미노의 사이즈(4)보다 클 경우 해당 자리에 테트리미노를 놓을 수 있다고 판단
	        
	        isValidLocation[4] = 7 라는 뜻은, (7, 4) 부터 막대기를 채울 수 있다는 뜻
	        isValidLocation[5] = 4 라는 뜻은, (4, 5) 부터 막대기를 채울 수 있다는 뜻
	         */
	        int[] isValidLocation = new int[c+1];
	        for(int j = 1; j <= c; j++) {
	            int count = 0;
	            int x = 0; // 테트리미노를 놓을 수 있는 행의 위치를 담는 변수
	            for(int i = 1; i <= r; i++) {
	                if(arr[i][j] == 0) {
	                    count++;
	                    x = i;
	                }
	                if(arr[i][j] == 1) break;
	            }
	            if(count >= 4) {
	                isValidLocation[j] = x;
	            }
	        }

	        int[] result = new int[c+1];
	        for(int j = 1; j <= c; j++) {
	            int x = isValidLocation[j];
	            if(x > 0) {
	                // 테트리미노 채우기
	                for(int k = 0; k < 4; k++) {
	                    arr[x-k][j] = 1;
	                }

	                // 매워지는 수평선 검사
	                int line = 0;
	                for(int k = 1; k <= r; k++) {
	                    int rowCount = 0;
	                    for(int p = 1; p <= c; p++) {
	                        if(arr[k][p] == 1) rowCount++;
	                    }
	                    // 한 행이 모두 1일 경우 삭제가 가능하다고 판단
	                    if(rowCount == c) line++;
	                }
	                // result[4] = 3 이라는 뜻은 4열에 테트리미노를 놓았을 때 삭제 되는 개수
	                // result[5] = 0 이라는 뜻은 5열에 테트리미노를 놓았을 때 삭제 되는 개수
	                result[j] = line;

	                // 테트리미노 삭제 (원상 복구)
	                for(int k = 0; k < 4; k++) {
	                    arr[x-k][j] = 0;
	                }
	            }
	        }

	        int max = 0;
	        int location = 0;
	        for(int i = 1; i <= c; i++) {
	            if(max < result[i]) {
	                location = i;
	                max = result[i];
	            }
	        }
	        bw.write(location + " " + max);

	        br.close();
	        bw.flush();
	        bw.close();
					 
	}

}
