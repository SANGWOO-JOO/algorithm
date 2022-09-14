package 완전탐색;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Part5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		
//		 while(st.hasMoreTokens()) { 
//		        System.out.println(st.nextToken()); 
//		    }
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		String i = br.readLine();
		br.close();
				
		int ii = Integer.parseInt(i);
		
		System.out.print(ii);
				
		bw.write(Integer.parseInt(i)+10+ "\n"); // 요렇게 개행문자를 넣거나
		bw.write("이렇게하면 출력 가능 : "+ (Integer.parseInt(i)+10));
	}

}
