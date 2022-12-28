package aljob_문자열;

import java.util.Scanner;

public class Two {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        Scanner scan = new Scanner(System.in);

        String s =scan.nextLine();
        String p =scan.nextLine();

        int length = s.length()/p.length();
        int plength =p.length();

        sb.append(s);
        System.out.println(sb);
//       int a =sb.indexOf(p);
//        System.out.println(a);
        int cnt=0;
//        for(int i=0; i<length; i++){
//
//            int a =sb.indexOf(p); // 인덱스의 값
//            sb.delete(a, plength);
//        }


    }
}
