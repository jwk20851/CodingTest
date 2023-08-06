//https://www.acmicpc.net/problem/2852

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        int[] team = new int[3];
        int teamA = 0, teamB = 0, preTime = 0, nowTime = 0;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            
            String time = st.nextToken();
            nowTime = (time.charAt(0)-'0')*600 + (time.charAt(1)-'0')*60;
            nowTime += (time.charAt(3)-'0')*10 + (time.charAt(4)-'0');
            
            if(team[1] > team[2])
                teamA += nowTime - preTime;
            else if(team[1] < team[2])
                teamB += nowTime - preTime;
            
            team[num]++;
            preTime = nowTime;
        }
        
        if(team[1] > team[2])
            teamA += 2880 - preTime;
        else if(team[1] < team[2])
            teamB += 2880 - preTime;
        
        //System.out.printf()로도 가능
        System.out.println(String.format("%02d:%02d", teamA/60, teamA%60));
		System.out.println(String.format("%02d:%02d", teamB/60, teamB%60));
	}
}