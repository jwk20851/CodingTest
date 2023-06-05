//https://www.acmicpc.net/problem/1969

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    private static int[] dna;
    private static int N, M, ans = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        String[] strArr = new String[N];
        for(int i = 0; i < N; i++)
            strArr[i] = br.readLine();
        
        String hd = "";
        for(int i = 0; i < M; i++){
            dna = new int[4];
            for(int j = 0; j < N; j++)
                countDNA((strArr[j].charAt(i)));
            
            hd += checkDNA();
        }
        
        System.out.println(hd);
        System.out.println(ans);
    }
    
    private static void countDNA(char c){
        switch(c){
            case 'A':
                dna[0]++;
                break;
            case 'C':
                dna[1]++;
                break;
            case 'G':
                dna[2]++;
                break;
            case 'T':
                dna[3]++;
                break;
        }
    }
    
    private static char checkDNA(){
        int idx = 0, max = 0;
        for(int i = 3; i >= 0; i--){
            if(max <= dna[i]){
                max = dna[i];
                idx = i;
            }
        }
        
        ans += N-max;
        
        char c = ' ';
        switch(idx){
            case 0:
                c = 'A';
                break;
            case 1:
                c = 'C';
                break;
            case 2:
                c = 'G';
                break;
            case 3:
                c = 'T';
                break;
        }
        
        return c;
    }
}