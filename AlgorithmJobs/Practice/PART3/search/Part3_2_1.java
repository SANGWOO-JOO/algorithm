package Practice.PART3.search;
/*
 * maxofarr
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Part3_2_1 {

	public static void main(String[] args) throws IOException {

		 /*
		  * InputStream  입력스트림
		  * InputStreamReader 문자 스트림
		  * 
		  * System.in 은 바이트스트림인 InputStream 타입이고 이 입력방법만으로는 문자를 온전하게 받기 힘드니 
		  * InputStreamReader 로 감싸주면서 바이트 단위 데이터를 문자 단위로 처리할 수 있게 한다.
		  */
		
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	     /*
	      * 최대값은 90 이 값은 5행 7열에 위치한다. 
	      */
	      int myMax = -1; 
	      int myRow = 0;
	      int mycol = 0;
	      /*
	       * 9행 9열로 이루어져있다. 
	       */
	      for(int row = 1; row < 10; row++) {
	    	  
	    	  StringTokenizer st = new StringTokenizer(br.readLine());   
	        for(int col = 1; col < 10; col++) {
	        	/*  new StringTokenizer(br.readLine()) -> 공백대로 띄어서 읽어드린다.
	        	 *  parseInt: 숫자로 변환하기
	        	 */
	        	
	          int tempVal = Integer.parseInt(st.nextToken());
	          /*
	           * tempVal 입력 받은 값이 현재 Max값 보다 클때 row , col 값을 넣어 준다 .
	           */
	          
	          if(myMax < tempVal) {
	            myMax = tempVal;
	            myRow = row;
	            mycol = col;
	          }
	        }
	      }
	      
	      System.out.println(myMax);
	      System.out.println(myRow + " " + mycol);     

	}

}
