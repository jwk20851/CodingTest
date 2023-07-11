//https://www.acmicpc.net/problem/1308

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int nowY = Integer.parseInt(st.nextToken());
		int nowM = Integer.parseInt(st.nextToken());
		int nowD = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int dY = Integer.parseInt(st.nextToken());
		int dM = Integer.parseInt(st.nextToken());
		int dD = Integer.parseInt(st.nextToken());
		
		if(dY-nowY>1000 || (dY-nowY==1000 && (dM>nowM || (dM==nowM && dD>=nowD)))){
			System.out.print("gg");
			return;
		}
		
		int nowDay = calcDay(nowY,nowM,nowD);
		int lastDay = calcDay(dY,dM,dD);
		
		System.out.print("D-"+(lastDay-nowDay));
    }
    
    private static int calcDay(int y, int m, int d){
        int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int total = 0;
        for(int i = 1; i < y; i++)
            total += 365 + checkYear(i);
        
        for(int i = 1; i < m; i++){
            if(i == 2)
                total += checkYear(y);
            total += day[i-1];
        }
        
        total += d;
        
        return total;
    }
    
    private static int checkYear(int n){
        return ((n%4==0 && n%100!=0) || n%400==0)? 1 : 0;
    }
}