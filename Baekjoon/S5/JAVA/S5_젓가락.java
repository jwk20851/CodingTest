//https://www.acmicpc.net/problem/24228

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken());
        long R = Long.parseLong(st.nextToken());
        
        //N+1 => 최악의 경우로 1쌍 완성, 2*(R-1) => 현재 0개의 젓가락을 2번씩 뽑으며 나머지 R-1쌍 완성
        System.out.println(N+1 + 2*(R-1));
    }
}