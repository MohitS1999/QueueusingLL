import java.util.*;
class Node{
	int data;
	Node next;
}
public class QueueusingLL{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Queue q=new Queue();
		q.enqueue(12);
		q.enqueue(13);
		q.enqueue(14);	
		q.enqueue(15);
		q.enqueue(16);
		q.enqueue(17);
		q.enqueue(18);
		q.enqueue(19);
		System.out.println("Deleted Element:-   "+q.dequeue());
		System.out.println("Deleted Element:-   "+q.dequeue());
		System.out.println("Deleted Element:-   "+q.dequeue());
		q.display();
		
	}
}
class Queue{
	Node front;
	Node rear;
	public void enqueue(int data){
		Node node=new Node();
		if (node==null)
			System.out.println("Queue is Full");
		else{
			node.data=data;
			node.next=null;
			if (front==null){
				front=node;
				rear=node;
			}else{
				rear.next=node;
				rear=node;
			}
		}
	}
	public int dequeue(){
		int x=-1;
		Node p;
		if (front==null)
			System.out.println("Queue is Empty1");
		else{
			p=front;
			front=front.next;
			x=p.data;
			p=null;
		}
		return x;
	}
	public void display(){
		Node n=front;
		System.out.println("display");
		while(n!=null){
			System.out.println(n.data);
			n=n.next;
		}
	}
}
	