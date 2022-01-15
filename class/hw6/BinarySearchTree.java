package hw6_1;

class Node {//트리 노드 구조 정의하는 클래스
	
	String key;
	Node left;
	Node right;
	
	public Node(String key) {
		this.key = key;		
	}		
}

public class MyBinarySearchTree {

	private Node root = null; //루트를 가리키는 노드 타입 변수
	
	public Node insertKey(Node t, String x) {
	        Node p = t;
	        Node newNode = new Node(x);	     
	        
	        if(p==null){ //루트가 null이면 루트에 삽입
	        	t = newNode;
	            return newNode;
	        }else if(t.key.compareToIgnoreCase(newNode.key)>0){
	            p.left = insertKey(p.left, x); //왼쪽에 삽입
	            return p;
	        }else if(t.key.compareToIgnoreCase(newNode.key)<0){
	            p.right = insertKey(p.right, x); //오른쪽에 삽입
	            return p;
	        }else{ 
	            return p;
	        }
	    }
	 public void add(String x) {
		 root = insertKey(root,x); //문자열을 매개변수로 받아 삽입 메소드로 보내는 메소드
	 } 	

	public void printTree() { //트리 키 값을 출력하는 메소드
		inorder(root);
	}
	
	public void inorder(Node t) { //중순위 순회하는 메소드
		if(t != null) {
			inorder(t.left);
			System.out.print(t.key+ " ");			
			inorder(t.right);
		}
	}
}
