	#include <stdio.h>

	
	int binarySearch(int arr[], int myStart , int myEnd , int value) {
		//arr의 myStart부터 myEnd 까지의 중에서 
		//value를 찾아 그 위치를 반환하는 함수
		//만약, 없다면 -1을 반환한다.
		
		int start, end;
		int mid;
		
		//start:value 보다 항상 작은 값을 가리킴
		//end : value 보다 항상 큰 값을 가리킴
		
		
		// 예외 처리 
		if(arr[myStart]>value)return -1;
		else if(arr[myStart]==value) return myStart;
		if(arr[myEnd]<value)return -1;
		else if(arr[myEnd]==value)return myEnd;
		
		start = myStart;
		end = myEnd;
		
		while(start+1 < end){
			
			
			mid =(start+end)/2;
			
			if(arr[mid]==value) return mid;
			else if(arr[mid]>value)end =mid;
			else start =mid ;
			
		}
		
		//start / send 
		return -1;
	
	}
	
	
    int main(){

       // Please Enter Your Code Here
	  int n,m;
	  
	  int arr[100];
	  
	  scanf("%d", &n);
	  int i;
	  for(i=0;i<n;i++)
	  	scanf("%d", &arr[i]);
	  
	  
	  scanf("%d",&m);
	  
	  int inx  = binarySearch(arr, 0, n-1,m); 
	 
	  
	  if(inx==-1){
	  	printf("수를 찾을수 없습니다");
	  }
	  else{
	  	printf("%d번째에 있습니다.",inx);
	  } 
	  return 0;
	
    }
	
