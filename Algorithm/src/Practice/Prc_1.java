package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Prc_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> list = new ArrayList<String>();
		 Scanner sc = new Scanner(System.in);
		 
		 int num = sc.nextInt();
		 for(int i=0; i<num; i++) {
			 String people = sc.next();
			 String inout = sc.next();
			 if(inout.equals("enter")) {
				 list.add(people);
			 }else {
				 list.remove(people);
			 }
		 }

		 Collections.sort(list);
		 for(int i=list.size()-1; i>=0; i--) {
			 System.out.println(list.get(i));
		 }
		 sc.close();
	}
}