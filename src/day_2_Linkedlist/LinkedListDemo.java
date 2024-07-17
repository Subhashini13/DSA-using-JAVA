package day_2_Linkedlist;

public class LinkedListDemo {

	private Node head;
	private Node tail;
	
	public Node getHead(){
		return this.head;
	}
	public Node getTail(){
		return this.tail;
	}
	public void addAtEnd(String data){
		//Create a new node
		Node node = new Node(data);
		
		//Check if the list is empty, 
		//if yes, make the node as the head and the tail
		if(this.head == null)
			this.head=this.tail=node;
		else{
    		//If the list is not empty, add the element at the end
    		this.tail.setNext(node);
    		//Make the new node as the tail
    		this.tail=node;
		}

	}

}
