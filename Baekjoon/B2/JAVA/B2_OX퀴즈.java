https://www.acmicpc.net/problem/8958

import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        
		String str = "";
        int cnt = 0, sum = 0;
		for(int i=0; i<n; i++) {
            cnt = 0;
			sum = 0;
			str = sc.next();
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j) == 'O') {
					cnt++;
					sum += cnt;
                }
				else
					cnt = 0;
			}
			System.out.println(sum);
		}
	}
}