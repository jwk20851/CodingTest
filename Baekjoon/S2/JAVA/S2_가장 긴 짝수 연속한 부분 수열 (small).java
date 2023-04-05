//https://www.acmicpc.net/problem/22857

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken())%2;
        
        int odd =(arr[0]%2 == 1)? 1:0, even =(arr[0]%2 == 0)? 1:0;
        int l = 0, r = 0, max = even;
        while(l<=r && r<N-1){
            if(odd <= K){
                r++;
                    
                if(arr[r] == 1)
                    odd++;
                else
                    even++;
                max = Math.max(max, even);
            }
            else{
                if(arr[l] == 1)
                    odd--;
				else
				    even--;
				l++;
            }
        }
        
        System.out.print(max);
    }
}