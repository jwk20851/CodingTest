//https://www.acmicpc.net/problem/11650

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2){
                if(o1[0] == o2[0])
                    return o1[1]-o2[1];
                else
                    return o1[0]-o2[0];
            }
        });
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++)
            sb.append(arr[i][0]+" "+arr[i][1]+"\n");
            
        System.out.print(sb);
        br.close();
    }
}