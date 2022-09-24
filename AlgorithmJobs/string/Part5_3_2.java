package string;

import java.util.*;

public class Part5_3_2 {

    static String bw;


    public static void main(String[] args)  {

    	Scanner sc = new Scanner(System.in);
    	/*
    	 * next()와 nextLine()의 차이 
    	 * 
    	 */
    	bw = sc.nextLine();
       
        for(int i = 0; i < bw.length(); i++) {
            if(bw.charAt(i) == ' ') continue;
            System.out.print(bw.charAt(i));
        }
        
    }
}
