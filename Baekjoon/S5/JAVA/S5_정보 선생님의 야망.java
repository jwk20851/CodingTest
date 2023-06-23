//https://www.acmicpc.net/problem/28238

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    private static int[][] stu;
    private static int[] maxDays;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		stu = new int[n][5];
		StringTokenizer st;
		for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 5; j++)
                stu[i][j] = Integer.parseInt(st.nextToken());
        }
        
		System.out.println(checkMax(n));
        for(int i = 0; i < 5; i++)
            System.out.print(maxDays[i]+" ");
	}
	
	private static int checkMax(int n){
        int max = -1;
        maxDays = new int[5];
        for(int i = 0; i < 4; i++){
            for(int j = i+1; j < 5; j++){
                int checkStu = 0;
                for(int k = 0; k < n; k++){
                    if(stu[k][i] == 1 && stu[k][j] == 1)
                        checkStu++;
                }
                
                if(checkStu > max){
                    max = checkStu;
                    maxDays = new int[5];
                    maxDays[i] = maxDays[j] = 1;
                }
            }
        }
        
        return max;
	}
}