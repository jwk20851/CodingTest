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
        while(i > 0){		//�������� arr[i-1] < arr[i]�� i ã��
            if(arr[i-1] >= arr[i])
                i--;
            else
                break;
        }
        if(i <= 0)			//�ش� ���� ������ ����
            return false;
            
        int j = N-1;
        while(arr[i-1] >= arr[j]){	//i <= j �鼭 arr[i-1] < arr[j]�� �����ϴ� j ã��
            j--;
        }
        
        swap(i-1, j);		//�ش� �ε��� ����
        
        j = N-1;
        while(i < j){		//i���� ������ ���� ������
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