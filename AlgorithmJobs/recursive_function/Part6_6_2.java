package recursive_function;

import java.util.*;

public class Part6_6_2 {
	static int n;
	static int result[] = new int[15];
	static char myInput[] = new char[15];
	static boolean checkMax[] = new boolean[30]; 
	static boolean checkMin[]= new boolean[30]; 
	static boolean printMax =false;
	static boolean printMin =false;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		n =sc.nextInt();
		
		for(int i=0;i<n;i++){
			myInput[i]=sc.next().charAt(0);
		  }
		  getMax(0);
		  getMin(0);
		  sc.close();
	}

	private static void getMin(int x) {
		// TODO Auto-generated method stub
		if(printMin==true)return;
		if(x>n){
		    for(int i=0;i<n+1;i++){
		      System.out.print(result[i]);
		      printMin =true;
		    }
		    System.out.println();
		  }
		
		else{
		    for(int i=0;i<=9;i++){
		      
		      result[x]=i;
		      
		      if(checkMin[i]==false){
		        //result[x-1]            result[x]
		        //           myInput[x-1]

		        //부등호 
		        boolean flag =false;

		        if(x==0) flag =true;
		        else{
		                
		                if(myInput[x-1]=='>'){
		                  if(result[x-1]>result[x])
		                    flag =true;
		                }
		                else{
		                  if(result[x-1]<result[x])
		                      flag =true;
		                }
		            }
		        //부등호까지 만족  
		        if(flag == true){
		           checkMin[i]=true;
		          //그 다음 숫자 결정하러 가도 된다.
		          getMin(x+1);
		          checkMin[i]=false;
		        }
		       }
		      
		      //i를 넣어보려면 몇가지를 만족...
		      //i를 넣어본적이 없어야한다.
		      result[x]=i;

		      
		    }
		      
		  }
	}

	private static void getMax(int x) {
		// TODO Auto-generated method stub
		  if(printMax==true)return;
		    
		  //x번째 숫자를 결정. result[x]를 결정한다.
		  // 부등호 x > n이면 끝나는거 
		  if(x>n){
		    for(int i=0;i<n+1;i++){
		      System.out.print(result[i]);
		      printMax =true;
		    }
		    System.out.println();
		  }
		  else{
		    for(int i=9;i>=0;i--){
		      
		      result[x]=i;
		      
		      if(checkMax[i]==false){
		        //result[x-1]            result[x]
		        //           myInput[x-1]

		        //부등호 
		        boolean flag =false;

		        if(x==0) flag =true;
		        else{
		                
		                if(myInput[x-1]=='>'){
		                  if(result[x-1]>result[x])
		                    flag =true;
		                }
		                else{
		                  if(result[x-1]<result[x])
		                      flag =true;
		                }
		            }
		        //부등호까지 만족  
		        if(flag == true){
		          checkMax[i]=true;
		          //그 다음 숫자 결정하러 가도 된다.
		          getMax(x+1);
		          checkMax[i]=false;
		        }
		       }
		      
		      //i를 넣어보려면 몇가지를 만족...
		      //i를 넣어본적이 없어야한다.
		      result[x]=i;

		      
		    }
		      
		  }
	}

}
