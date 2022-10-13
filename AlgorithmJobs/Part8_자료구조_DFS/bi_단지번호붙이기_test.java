package Part8_자료구조_DFS;
import java.util.*;
public class bi_단지번호붙이기_test {
	
	static int n;
	static int [][]map;
	static boolean[][]visit;
	static int [][] pos = {{-1,0},{1,0},{0,-1},{0,1}};
	static int count=0;
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	n=sc.nextInt();
	map =new int[n][n];
	visit =new boolean[n][n];
	
	for(int i=0;i<n;i++) {
		String str=sc.next();
		
		for(int j=0;j<n;j++) {
			map[i][j] =str.charAt(j)-'0'; 	
		}
	}
	
	ArrayList<Integer> resultList = new ArrayList<>();
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(map[i][j]==1&&!visit[i][j]) {
				count =0;
				dfs(i,j);
				
				resultList.add(count);
			}
		}
	}
	// for ed
		
	System.out.println(resultList.size()); 
	Collections.sort(resultList);
	for(Integer integer : resultList) {
		System.out.println(integer);
	}
	
	}

	private static void dfs(int row, int column) {
		// TODO Auto-generated method stub
		count ++;
		visit[row][column] =true;
		
		for(int i=0;i<pos.length;i++) {
			int nr = row + pos[i][0];
			int nc = column + pos[i][1];
			
		if(nr>=0&&nr<n&&nc>=0&&nc<n&&map[nr][nc]==1&&!visit[nr][nc]) {
			dfs(nr ,nc);
		}
		}
	}

}
