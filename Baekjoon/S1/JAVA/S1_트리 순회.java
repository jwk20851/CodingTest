//https://www.acmicpc.net/problem/1991

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    static Node root = new Node('A', null, null);
    
    static class Node{
        char header;
        Node left, right;
        
        Node(char header, Node left, Node right){
			this.header = header;
			this.left = left;
			this.right = right;
		}
    }
    
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(n-- > 0){
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    
		    char pa = st.nextToken().charAt(0);
			char lc = st.nextToken().charAt(0);
			char rc = st.nextToken().charAt(0);
			
			insert(root, pa, lc, rc);
		}
		
		preOrder(root);
		System.out.println();
		inOrder(root);
		System.out.println();
		postOrder(root);
		System.out.println();
	}
	
	static void insert(Node tmp, char head, char left, char right) {
		if(tmp.header == head){
			tmp.left = (left == '.')? null : new Node(left,null,null);
			tmp.right = (right == '.')? null : new Node(right,null,null); 
		}
		else{
			if(tmp.left != null)
			    insert(tmp.left, head, left, right);
			if(tmp.right != null)
			    insert(tmp.right, head, left, right);
		}
	}
	
	static void preOrder(Node node){
		if(node == null)
		    return;
		    
		System.out.print(node.header);
		preOrder(node.left);
		preOrder(node.right);
	}
	
	static void inOrder(Node node){
		if(node == null)
		    return;
		    
		inOrder(node.left);
		System.out.print(node.header);
		inOrder(node.right);
	}
	
	static void postOrder(Node node){
		if(node == null)
		    return;
		    
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.header);
	}
}