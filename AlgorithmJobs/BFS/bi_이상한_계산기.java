package BFS;

import java.io.*;
import java.util.*;

public class bi_이상한_계산기 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 Scanner sc = new Scanner(System.in); 
         int target = sc.nextInt(); //10

         if(target==1) System.out.println("0");
         else if(target==0) System.out.println("1");
         else System.out.println( bps(target) );
	}

	private static int bps(int target) {
		// TODO Auto-generated method stub
		
		Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        
        int level = 0;
        
        while (!queue.isEmpty()){
        	 int qSize = queue.size();
             for(int i=0; i<qSize; i++){
            	 
        	 int currentNum = queue.poll();
        	 
        	 if(currentNum==target) return level;
             if(currentNum * 2 < 100000) queue.offer(currentNum*2 );
             if(currentNum/3 != 0) queue.offer( currentNum/3 );
                         	 
             }
             level++;
        }
        return -1;
	}
}
