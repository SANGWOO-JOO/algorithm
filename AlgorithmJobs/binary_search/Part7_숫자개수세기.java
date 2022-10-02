package binary_search;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Part7_숫자개수세기 {
	
	static int Max = 1000005;
	 private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	 
	static int n ,q ;
	static long[] data = new long[Max];
	static long[] search = new long  [Max];

	public static void main(String[] args) throws IOException {
		
		
		 
		 StringTokenizer st = new StringTokenizer(br.readLine());
	        n = Integer.parseInt(st.nextToken());
	        q = Integer.parseInt(st.nextToken());

	    st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			data[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(data);
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < q; i++) {
			
			search[i]=Integer.parseInt(st.nextToken());
			
			long front , rear;
			
			front = startsearch(search[i]);
			rear =  endsearch(search[i]);
			
			if(front == -1 ) {
				System.out.print("0"+"\n");	
			}
			else {
				System.out.print((rear-front + 1) + "\n");	
			}
			
			
		}
		
		
	}

	private static long startsearch(int value) {
		int start , end ;
		//start는 항상 value보다 
		
		if (data[0] < value)
		    start = 0 ;
		else {
		if (data[0] > value)
			return -1; // 없다는 의미 
		else 
			return 0; //첫번째 인덱스 반환
		}

		if (data[n - 1] >= value) 
			end = n - 1;
		else {
			return -1;
		}
		// start , end 끝
		
		
		
		while (start + 1 < end) {   //start ,end가 붙어있지 않다면 	
			int mid = (start + end) / 2;

			if (data[mid] < value)
				start = mid;
			else 
				end = mid;
		}

		if (data[end] == value)
			return end;
		else
			return -1;
	}
	
	private static int endsearch(int value) {
		int start, end;
		// start는 value보다 항상 작거나 같은 값을 가리켜야 한다
		//end는 value 보다 크거나 같은 값을 가리킨다 

		if (data[0] <=value) 
			start = 0;
		else
			return -1;

		if (data[n - 1] > value)
			end = n - 1;
		else {
			if (data[n - 1] < value)
				return -1;
			else 
				return n - 1;
		}

		while (start + 1 < end) {
			int mid = (start + end) / 2;

			if (data[mid] <= value) 
				start = mid;
			else 
				end = mid;
		}

		if (data[start] == value)
			return start;
		else
			return -1;
	}

	
}