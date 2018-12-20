package lists;


public class LinkedList {
	private Node headNode;
	
	public LinkedList(int data) {
		headNode = new Node(data, null);
	}

	public void addNode(int data) {
		Node newNode = new Node(data, null);
		newNode.next = headNode;
		headNode = newNode;
		
	}
	
	public void showList() {
		System.out.println("---LinkedList---");
		Node nodeIterator = headNode;
		while (nodeIterator != null) {
			nodeIterator.displayData();
			nodeIterator = nodeIterator.next;
		}
	}
	
	public void deleteHead() {
		if(headNode.next != null) {
			headNode = headNode.next;
		}else {
			System.out.println("Cant delete head node...");
		}
	}
	
	class Node{
		private int data;
		private Node next;
		
		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}

		public void displayData() {
			System.out.println(data + " ");
		}
		
	}

}


