import java.util.*;

class DoublyLinke{
 	private class Node{
		int i;
		Node before;
		Node next;
		
		Node(int i){
			this.i = i;
		}
	}
	
	private Node head;
	public void add(int i) {
		Node node = new Node(i);
		
		if(head == null)head = node;
		else {
			Node first = head;
			while(first.next != null) {
				first = first.next;
			}
			
			first.next = node;
			node.before = first;
		}
	}
	public void delete(int index) {
		int count = 0;
		Node first = head;
		
		while(first != null) {
			count++;
			if(count == index) break;
			first = first.next;
		}
		
		first.before.next = first.next;
		first.next.before = first.before;
	}
	public int size() {
		Node first = head;
		int count = 0;
		
		while(first != null) {
			count++;
			first = first.next;
		}
		
		return count;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		Node first = head;
		
		if(first == null) sb.append("[]");
		else {
			sb.append("[");
			
			while(first != null) {
				sb.append(first.i);
				sb.append(",");
				
				first = first.next;
			}
			sb.deleteCharAt(sb.length()-1);
			sb.append("]");
		}
		
		return sb.toString();
	}
}