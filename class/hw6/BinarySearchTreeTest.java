package hw6_1;

public class MyBinarySearchTreeTest {

	public static void main(String[] args) {
		MyBinarySearchTree tree = new MyBinarySearchTree();
		
		System.out.print("\n오름차순 출력 = ");
		tree.printTree();
		
		tree.add("cat");
		System.out.print("\n오름차순 출력 = ");
		tree.printTree();

		tree.add("HAT");
		tree.add("ant");
		tree.add("BEE");
		tree.add("dog");
		tree.add("Last");
		tree.add("KEY");
		tree.add("Korea");
		tree.add("egg");
		tree.add("ink");
		tree.add("juice");
		tree.add("free");
		tree.add("go");
		tree.add("CAT"); // 이미 존재하는 단어이므로 삽입되지 않을 것임
		System.out.print("\n오름차순 출력 = ");
		tree.printTree();   
	}

}
