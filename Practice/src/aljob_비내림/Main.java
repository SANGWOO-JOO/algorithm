package aljob_비내림;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] arr = new int[n]; // 배열 길이 정하기

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt(); // 한줄식 넣기
        }

//        System.out.println("입력 값= " + arr[0] );
//        System.out.println("입력 값= " + arr[1] );
//        System.out.println("입력 값= " + arr[2] );
//        System.out.println("입력 값= " + arr[3] );




          /*
           1.  arr[0]과 arr[1]을 비교 arr[0] > arr[1] 이면 arr[0] -1 을 한다.
           2.  arr[0] == arr[5]이 되면 나온다.
           3.  그리고 cnt 카운트
             */


//        for(int i=0; i<n-1; i++){
//            for(int j=1; i<n;j++){
//
//            }
//        }

//        if(arr[0]>arr[1]) arr[0]--;

//        System.out.println("입력 값= " + arr[0]);
//        System.out.println("입력 값= " + arr[1]);
//        System.out.println("입력 값= " + arr[2]);
//        System.out.println("입력 값= " + arr[3]);

//        System.out.println(cnt);

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] >= arr[j]) { //오름차순
                    arr[i]--;
                    cnt++;
                    j --;
//                    System.out.println("j의 인덱스" +j);
                } else {
                    continue;
                }
//                System.out.println("-----------");
            }
        }

//        for(int i=0;i<4;i++){
//            System.out.println(arr[i]);
//        }
//        System.out.println("----");
        System.out.println(cnt);
    }
}