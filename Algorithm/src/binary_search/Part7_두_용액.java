package binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Part7_두_용액 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int []arr =new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		
		Arrays.sort(arr);
		
		int []res =new int[1];
		
		int s=0, e= n-1; 
		int gap=Integer.MAX_VALUE; // 정수 최대값
		int temp;
		int ans1 =0;
		int ans2 =0;
		while(s<e) {
			int sum =arr[s]+arr[e];
			
			temp=Math.abs(sum);
			if(temp<gap) { // 0에 더 수렴할때
				gap =temp;
				ans1= arr[s];
				ans2= arr[e];
			}
			
			if(sum<0) 
				s++;
			else 
				e--;
		}
		System.out.println(ans1+" "+ans2);		
	}
}
