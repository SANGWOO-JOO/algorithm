package BFS;

import java.io.*;
import java.util.*;

public class bi_이상한_계산기 {
	private static int n;
    private static boolean[] isvisited = new boolean[1000000];

	public static void main(String[] args) {

	 Scanner sc = new Scanner(System.in); 
	 n =sc.nextInt();
	
	 if(n==1) System.out.println("0");
     else if(n==0) System.out.println("1");
     else System.out.println( bfs(n) );
	}

	private static int bfs(int v) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        int level=0;

        while(!queue.isEmpty()) {
            
        	int qSize = queue.size();
            for(int i=0; i<qSize; i++){

                int currentNum = queue.poll();
                if(currentNum==n) return level;
                
                if( currentNum*2 < 100000 && !isvisited[currentNum*2] ){
                	isvisited[currentNum*2]=true;
                    queue.offer(currentNum*2 );
                }

                if( currentNum/3 != 0 && !isvisited[currentNum/3] ){
                	isvisited[currentNum/3]=true;
                    queue.offer( currentNum/3 );
                }
            }
            level++;
            }
		return -1;
            
            
            
	}
}
