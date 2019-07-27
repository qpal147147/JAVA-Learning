import java.util.*;

class Stack{
 	class Node{
 		int data;
 		Node next;
 		
 		Node(int data){
 	 		this.data = data;
 	 	}
 	}
 	
 	private Node head;
 	
 	Stack(){};
 	Stack(int data){
 		push(data);
 	}
 	
 	public void push(int data) {
 		if(head == null) {
 			Node n = new Node(data);
 			head = n;
 		}
 		else{
 			Node first = head;
 			while(first.next != null) {
 				first = first.next;
 			}
 			Node n = new Node(data);
 			first.next = n;
 		}
 	}
 	public void pop() {
 		Node first = head;
 		if(first != null && first.next != null) {
	 		while(first.next.next != null) {
	 			first = first.next;
	 		}
	 		first.next = null;
 		}
 		else {
 			head = null;
 		}
 	}
 	public int size() {
 		int count = 0;
 		Node first = head;
 		
 		while(first != null) {
 			count++;
 			first = first.next;
 		}
 		return count;
 	}
 	public String toString() {
 		Node first = head;
 		
 		StringBuilder sb = new StringBuilder();
 		while(first != null) {
 			sb.append(first.data);
 			sb.append(" ");
 			first = first.next;
 		}
 		return sb.toString();
 	}
}