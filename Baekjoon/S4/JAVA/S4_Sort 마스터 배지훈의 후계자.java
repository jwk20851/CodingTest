//https://www.acmicpc.net/problem/20551

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[N];
        for(int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(br.readLine());
        
        Arrays.sort(arr);
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0 ; i < N ; i++){
            if(!map.containsKey(arr[i]))
                map.put(arr[i], i);
        }
        
        StringBuilder sb = new StringBuilder();
        while(M-- > 0){
            int tmp = Integer.parseInt(br.readLine());
            sb.append(map.containsKey(tmp)? map.get(tmp)+"\n":"-1\n");
        }
        
        System.out.print(sb);
    }
}