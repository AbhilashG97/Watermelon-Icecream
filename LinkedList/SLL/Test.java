import java.io.*;

class Test {
	public static void main(String []args) throws Exception{
		MyLinkedList mll = new MyLinkedList();
		try(BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))){
			mll.head = new MyLinkedList.Node(bfr.readLine());
			MyLinkedList.Node se = new MyLinkedList.Node(bfr.readLine());
			MyLinkedList.Node th = new MyLinkedList.Node(bfr.readLine());
		}
		// Linking of nodes
		mll.head.next = se;
		se.next = th;

		mll.printList(); 
	}
}