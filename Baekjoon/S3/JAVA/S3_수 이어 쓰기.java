//https://www.acmicpc.net/problem/1515

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
    	int idx = 0;
        while(true){
			idx++;
			String num = Integer.toString(idx);
			while(num.length()>0 && N.length()>0){
				if(num.charAt(0) == N.charAt(0))
					N = N.substring(1);     //1번째 위치부터 자르기
				num = num.substring(1);
			}
			if(N.equals("")){
				System.out.println(idx);
				break;
			}
		}
	}
}