package day_2_Linkedlist;

public class InsertLinkedList {
	private Node head;
	private Node tail;

	public Node getHead() {
		return this.head;
	}

	public Node getTail() {
		return this.tail;
	}

	public void insert(String data, String dataBefore) {
		Node node = new Node(data);
		// Check if the list is empty,
		// if yes, make the node as the head and the tail
		if (this.head == null)
			this.head = this.tail = node;
		else {
			// Find the node after which the data has to be inserted
			Node nodeBefore = this.find(dataBefore);
			if (nodeBefore != null) {
				// Insert the new node after nodeBefore
				node.setNext(nodeBefore.getNext());
				nodeBefore.setNext(node);
				// If nodeBefore is currently the tail node,
				// make the new node as the tail node
				if (nodeBefore == this.tail)
					this.tail = node;
			} else
				System.out.println("Node not found");
		}
	}

}
