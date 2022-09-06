package Practice.part2;

import java.util.Scanner;

public class part2_4_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j;
		int cnta = 0,cntb=0,cntd=0;
		int a[] =new int[10];
		int b[] =new int[10];
	 // A값 정보 입력 받기 
		for(i=0;i<10;i++) {
			a[i] =sc.nextInt();
		}
	 // B값 정보 입력 받기 
		for(i=0;i<10;i++) {
			b[i]=sc.nextInt();
		}	
		
		for(i=0;i<10;i++) {
				
			if(a[i]>b[i]) {
				cnta++;
			}
			else if(a[i]<b[i]) {
				cntb++;
			}
			else {
				cntd++;
			}
		}
			

		
		if(cnta>cntb) {
			System.out.print("A");
		}
		else if(cntb>cnta){
			System.out.print("B");
		}
		else if(cnta==cntb) {
			System.out.print("D");
		}

	}

}
