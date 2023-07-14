//https://www.acmicpc.net/problem/2303

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		int[] arr;
		int[] sum = new int[N];
		for(int i = 0; i < N; i++){
		    st = new StringTokenizer(br.readLine());
		    arr = new int[5];
		    for(int j = 0; j < 5; j++){
		        arr[j] = Integer.parseInt(st.nextToken());
		    }
		    
		    sum[i] = searchSum(arr);
		}
		
		System.out.println(findAns(sum)+1);
    }
    
    private static int searchSum(int[] arr){
        int max = 0;
        for(int i = 0; i < 5; i++){
            for(int j = i+1; j < 5; j++){
                for(int k = j+1; k < 5; k++){
                    max = Math.max(max, (arr[i]+arr[j]+arr[k])%10);
                }
            }
        }
        
        return max;
    }
    
    private static int findAns(int[] sum){
        int ans = 0, num = 0;
        for(int i = 0; i < sum.length; i++){
            if(ans <= sum[i]){
                ans = sum[i];
                num = i;
            }
        }
        
        return num;
    }
}