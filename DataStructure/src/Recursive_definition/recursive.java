package Recursive_definition;

//순차 탐색
// search(data, 0, n-1, target)
public class recursive {
	
	public static void main(String [] args){
        int result = tailRecursive(5, 0);
 		System.out.println(result);
    }
    
	public static int tailRecursive(int n, int acc)
	{
 		if(n==1) {
        	return acc;
    	} 
 		return tailRecursive(n-1, n + acc );        
    }

}
