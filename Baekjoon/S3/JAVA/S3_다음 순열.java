//https://www.acmicpc.net/problem/10972

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    private static int N;
    private static int[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++)
		    arr[i] = Integer.parseInt(st.nextToken());
		
		if(checkPermutation()){
    		for(int i = 0; i < N; i++)
    		    System.out.print(arr[i]+" ");
		}
		else
		    System.out.println(-1);
    }
    
    private static boolean checkPermutation(){
        int i = N-1;
        while(i > 0){		//우측부터 arr[i-1] < arr[i]인 i 찾기
            if(arr[i-1] >= arr[i])
                i--;
            else
                break;
        }
        if(i <= 0)			//해당 경우는 마지막 순열
            return false;
            
        int j = N-1;
        while(arr[i-1] >= arr[j]){	//i <= j 면서 arr[i-1] < arr[j]를 만족하는 j 찾기
            j--;
        }
        
        swap(i-1, j);		//해당 인덱스 스왑
        
        j = N-1;
        while(i < j){		//i부터 끝까지 순서 뒤집기
            swap(i, j);
            i++;
            j--;
        }
        
        return true;
    }
    
    private static void swap(int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}