package recursive_function;

public class Study {

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
