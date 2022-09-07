package Practice;
import java.util.Scanner;
public class part1_7_1{
    public static void main(String[] args){

    int a;

    Scanner sc = new Scanner(System.in);  
    a = sc.nextInt();
    
    if(a%2==0){
      System.out.print("even");
    }
    else{
      System.out.print("not even");
    }
    }
}