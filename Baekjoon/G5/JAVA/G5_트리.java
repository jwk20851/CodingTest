//https://www.acmicpc.net/problem/1068

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    private static int N, delete, cnt = 0;
    private static int[] tree;
    private static boolean[] visited;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		tree = new int[N];
		int root = 0;
		for(int i = 0; i < N; i++){
		    tree[i] = Integer.parseInt(st.nextToken());
		    if(tree[i] == -1)
		        root = i;
		}
		
		int delete = Integer.parseInt(br.readLine());
		deleteNode(delete);		//노드 삭제
		
		visited = new boolean[N];
		cnt = 0;
        searchLeaf(root);
        
		System.out.println(cnt);
	}
	
	private static void deleteNode(int d){
	    tree[d] = -2;	//삭제된 노드는 -2로 표시
	    for(int i = 0; i < N; i++){
	        if(tree[i] == d)
	            deleteNode(i);
	    }
	}
	
	private static void searchLeaf(int r){
        if(tree[r] == -2)	//삭제됐을 경우 리턴
            return;

        visited[r] = true;
	    boolean check = true;
        for(int i = 0; i < N; i++){
            if(tree[i] == r && !visited[i]){	//자식 노드이고 해당 노드를 방문하지 않았을 경우
                check = false;
                searchLeaf(i);
            }
        }
        
        if(check)
            cnt++;
	}
}