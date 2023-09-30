//https://www.acmicpc.net/problem/1459

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long X = Integer.parseInt(st.nextToken());
        long Y = Integer.parseInt(st.nextToken());
        long W = Integer.parseInt(st.nextToken());
        long S = Integer.parseInt(st.nextToken());
        
        long tmpA = 0, tmpB = 0, tmpC = 0;
        tmpA = (X+Y)*W;
        tmpB = ((X+Y)%2 == 0)? Math.max(X,Y)*S : (Math.max(X,Y)-1)*S+W;
        tmpC = Math.min(X,Y)*S + Math.abs(X-Y)*W;
        
        System.out.print(Math.min(tmpA, Math.min(tmpB, tmpC)));
    }
}