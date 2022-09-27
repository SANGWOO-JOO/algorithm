
#include <stdio.h>



int binarySearch(int arr[], int start, int end, int target){

  if(start>end) return -1;

  else if(start==end){

    if(arr[start] == target) return start;

    else return -1;

  }else{

    int mid = (start + end) / 2;

    if(arr[mid] == target) return mid;

    else if(arr[mid] > target) binarySearch(arr,start,mid-1,target);

    else if(arr[mid] < target) binarySearch(arr,mid+1,end,target);

  }

  

  

}

int main() {



  //Please Enter Your Code Here

  int n,q;

  int arr[100010];

  int target[100010];

  scanf("%d %d",&n,&q);

  for(int i=0; i<n; i++){

    scanf("%d",&arr[i]);

  }

  

  for(int i=0; i<q; i++){

    scanf("%d",&target[i]);

  }

  

  for(int i=0; i<q; i++){

    int inx = binarySearch(arr,0,n-1,target[i]);

    if(inx==-1) {

      printf("NO\n");

    }else{

      printf("YES\n");

    }

  }

  

  return 0;

}
