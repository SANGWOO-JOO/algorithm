package Exam.exam2;

import java.util.Arrays;
import java.util.Scanner;
public class three{
    public static int[] numbers;
 
    public static int binarySearch(int start, int end, int target) {
        if (start > end) return -1;
        if (start == end) 
        	return (numbers[start] == target) ? start : -1;
 
        int mid = (end + start) / 2;
 
        if (numbers[mid] == target) return mid;
        if (numbers[mid] < target) return binarySearch(mid + 1, end, target);
        if (numbers[mid] >= target) return binarySearch(start, mid, target);
 
        return -1;
    }
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] buf;
 
        buf = scan.nextLine().split(" ");
        
        int numberCnt = Integer.parseInt(buf[0]);
        int questionCnt = Integer.parseInt(buf[1]);
        
        numbers = new int[numberCnt];
 
        buf = scan.nextLine().split(" ");
        
        for (int i = 0; i < numberCnt; i++) {
            numbers[i] = Integer.parseInt(buf[i]);
        }
 
        Arrays.sort(numbers);
 
        buf = scan.nextLine().split(" ");
        int answer, target;
        for (int i = 0; i < questionCnt; i++) {
            answer = 0;
            target = Integer.parseInt(buf[i]);
 
            int index = binarySearch(0, numberCnt - 1, target);
            if (index < 0) {
                System.out.println(0);
                continue;
            }
            answer++;
            for (int j = index - 1; j >= 0 && numbers[j] == target; j--) answer++;
            for (int j = index + 1; j < numbers.length && numbers[j] == target; j++) answer++;
            System.out.println(answer);
        }
    }
}