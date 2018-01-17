package practice.linkedlist;

public class LinkedList {
	
	Node head;
	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	//traversal
	
	public void printList() {
		Node n = head;
		while(n != null) {
			System.out.println(n.data+" ");
			n = n.next;
		}
	}
	
	/**********************INSERTION IN TO A LINKEDLIST************************/
	//Insertion at the beginning of the list
	public void push(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
	}
	
	//Insertion after a given node
	public void insertAfter(Node prev_node, int data) {
		if (prev_node != null) {
			Node new_node = new Node(data);
			new_node.next = prev_node.next;
			prev_node.next = new_node;
		}
	}
	
	//Insertion at the end
	public void insertEnd(int data) {
		Node new_node = new Node(data);
		if (head == null) {
			head = new_node;
			return;
		}
		new_node.next = null;
		Node last = head;
		while(last.next != null) {
			last = last.next;
		}
		last.next = new_node;
	}
	/**********************END OF INSERTION METHODS************************/
	
	/**********************DELETION FROM A LINKEDLIST************************/
	
	public void deleteNode(int key) {
		Node temp = head, prev = null;
		if (temp != null && temp.data == key) {
			head = temp.next;
			return;
		}
		while (temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}
		
		if (temp == null) {
			return;
		}
		prev.next = temp.next;
		
	}
	
	public void deleteNodeAtPosition(int position) {
		Node n = head;
		int pos = 1;
		if (n == null) {
			return;
		}
		if (position == 0) {
			head = n.next;
		}
		while(n != null && pos != position) {
			n = n.next;
			pos ++;
		}
		deleteNode(n.next.data);
	}
	
	/**********************END OF DELETION METHODS************************/
	
	//Find the length of Linked List
	
	public int getLengthIterative() {
		int count = 0;
		Node n = head;
		if (n == null) {
			return 0;
		}
		while (n != null) {
			n = n.next;
			count++;
		}
		return count;
	}
	
	public int getLengthRecursive(Node node) {
		if (node == null) {
			return 0;
		}
		return 1 + getLengthRecursive(node.next);
	}
	
	// Searching Linked List
	
	public void search(Node n, int data) {
		int position  = 1;
		n = head;
		while(n != null) {
			if (n.data == data)
				break;
			position++;
			n = n.next;
		}
		if (n == null) {
			System.out.println("Element is not found.");
		}else
			System.out.println("Element is found at position: " + position);
	}
	
	public void swapNodes(int x, int y) {
		Node prevX = null, currX = head;
		Node prevY = null, currY = head;
		
		while(currX != null && currX.data != x) {
			prevX = currX;
			currX = currX.next;
		}
		
		while(currY != null && currY.data != y) {
			prevY = currY;
			currY = currY.next;
		}
		
		if (prevX != null) {
			prevX.next = currY;
		}else
			head = currY;
		
		if (prevY != null) {
			prevY.next = currX;
		}else
			head = currX;
		
		Node temp = currX.next;
		currX.next = currY.next;
		currY.next = temp;
	}
	
	public void reverse() {
		Node prev = null, curr = head, next = null;
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList linkedList = new LinkedList();
		 
		linkedList.head  = new Node(1);
        Node second = new Node(2);
        Node third  = new Node(3);
        
        linkedList.head.next = second;
        second.next = third;
        linkedList.push(4);
        linkedList.insertAfter(second, 10);
        linkedList.insertEnd(25);
        linkedList.deleteNode(10);
        linkedList.printList();
        System.out.println("-------------------------------------");
        linkedList.deleteNodeAtPosition(3);
        linkedList.printList();
        System.out.println("Iterative Length: " + linkedList.getLengthIterative());
        System.out.println("Recursive Length: " + linkedList.getLengthRecursive(linkedList.head));
        linkedList.search(linkedList.head, 25);
        linkedList.swapNodes(1,25);
        linkedList.printList();
        System.out.println("Reverse List");
        linkedList.reverse();
        linkedList.printList();
	}
}
