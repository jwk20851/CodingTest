//https://www.acmicpc.net/problem/14891

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    private static int[][] gear = new int[4][8];
    private static int sum = 0;
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0; i < 4; i++){
		    String str = br.readLine();
		    for(int j = 0; j < 8; j++)
		        gear[i][j] = str.charAt(j)-'0';
		}
		
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++){
		    st = new StringTokenizer(br.readLine());
		    int num = Integer.parseInt(st.nextToken());
		    int dir = Integer.parseInt(st.nextToken());
		    turnGear(num-1, dir);
		}
		
        System.out.print(checkSum());
    }
    
    private static void turnGear(int num, int dir){
        turnLeft(num-1, dir*(-1));
        turnRight(num+1, dir*(-1));
        checkGear(num, dir);
    }
    
    private static void checkGear(int n, int d){
        int tmp = 0;
        if(d == 1){
            tmp = gear[n][7];
            for(int i = 7;  i > 0; i--)
				gear[n][i] = gear[n][i-1];
            gear[n][0] = tmp;
        }
        else{
            tmp = gear[n][0];
            for(int i = 0; i < 7; i++)
				gear[n][i] = gear[n][i+1];
            gear[n][7] = tmp;
        }
    }
    
    private static void turnLeft(int n, int d){
        if(n < 0 || gear[n][2]==gear[n+1][6])
            return;
        turnLeft(n-1, d*(-1));
		checkGear(n, d);
    }
    
    private static void turnRight(int n, int d){
        if(n > 3 || gear[n][6]==gear[n-1][2])
            return;
        turnRight(n+1, d*(-1));
		checkGear(n, d);
    }
    
    private static int checkSum(){
        int sum = 0;
        for(int i = 0; i < 4; i++)
			sum += gear[i][0] * Math.pow(2, i);
		
		return sum;
    }
}