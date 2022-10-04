package Part8_자료구조_Stack_Queue;

import java.util.Scanner;

/* 원형 큐
 * front : int - 초기 값 0, 처음 데이터의 바로 전 인덱스
 * rear : int - 초기 값 0, 마지막 데이터의 인덱스
 * isEmpty() : boolean - 큐가 비어있는가
 * isFull() : boolean - 큐가 가득 찼는가
 * enqueue() : void - 데이터 넣기
 * dequeue() : void - 데이터 빼기
 * diplay() : void - 데이터 출력
 * */

public class CC_원형큐 {

	//const
	 private static final int MAX_SIZE = 5;
	 static private int n,m;
	 static private int a,b;
    private static int front=0;
    private static int rear=0;
    private static int[] queue=new int[MAX_SIZE];
	    
	    public static void main(String[] args) {
	    	
	    	Scanner sc = new Scanner(System.in);
			n =sc.nextInt();
			m =sc.nextInt();
			
			for(int i=0;i<m;i++) {
				a =sc.nextInt();
				
				if(a==1) {
				b =sc.nextInt();
				push(b);
				}
				else if(a==2) {
				pop();
				}
				else{
				top();
				}			  
			}
	    }
	    
	    
	    // front와 rear이 같은 위치에 있다면 큐가 비어있다는 뜻이다.
	    private static boolean isEmpty() {
	        return front == rear;
	    }
	    // rear이 front의 바로 전 위치에 있다면 큐가 가득찼다는 뜻이다.
	    private static boolean isFull() {
	        return (rear+1) % MAX_SIZE == front;
	    }
	    // 데이터가 들어갈 땐 rear만 움직인다. 
	    // rear의 위치는 최근에 들어온 데이터의 위치이다. 
	    // 즉, 새로운 데이터가 들어오기 위해 먼저 이동해야한다.
	    public static void push(int data) {
	        // 큐가 가득차면 들어갈 수 없다 -> 리턴
	        if (isFull())
	            System.out.println("Overflow");
	            // 큐에 자리가 있다면 데이터를 넣는다.
	        else {
	            rear = (++rear) % MAX_SIZE; //원형 큐이기 때문에 순환한다.
	            queue[rear] = data;
	        }
	    }
	    // 데이터가 나갈 땐 front만 움직인다. 
	    public static void pop() {
	        int preIndex;
	        // 큐가 비어있다면 데이터를 뺄 수 없다. 나는 데이터가 없다는 신호로 -1을 리턴했다(임시 정의)
	        if (isEmpty())
	        	System.out.println("Underflow");
	            // 큐에 데이터가 있다면 데이터를 뺀다. front 이동(증가)
	        else {
	            preIndex = front;
	            front = (++front) % MAX_SIZE;
	        }
	    }

	    public static void top() {
	        
	    	if(queue[front]<0){
	    		System.out.println("NULL");
	    	}
	    	else {
	    		System.out.println(queue[front]+1);
	    	}
	       
	    }

}
