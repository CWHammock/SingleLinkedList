package lists;

public class Main {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList(32);
		linkedList.addNode(44);
		linkedList.addNode(58);
		linkedList.addNode(13);
		linkedList.showList();
		linkedList.deleteHead();
		linkedList.showList();

	}

}
