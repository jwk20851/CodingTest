//https://www.acmicpc.net/problem/1380

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int scenario = 1;
        while(true){
            int N = Integer.parseInt(br.readLine());
            if(N == 0)
                break;
            
            String[] stu = new String[N];
            for(int i = 0; i < N; i++)
                stu[i] = br.readLine();
            
            int[][] arr = new int[N][2];
            for(int i = 0; i < 2*N-1; i++){
                st = new StringTokenizer(br.readLine());
                arr[Integer.parseInt(st.nextToken())-1][0]++;
                st.nextToken();
            }
            
            for(int i = 0; i < N; i++){
                if(arr[i][0]==1)
                    sb.append(scenario+" "+stu[i]+"\n");
            }
            
            scenario++;
        }
        System.out.println(sb);
    }
}