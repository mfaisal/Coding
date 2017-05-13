
class Node{
	int key;
	Node next;
	
	public Node(int k){
		key = k;
		next = null;
	}
}

class Queue{
	Node front;
	Node rear;
	
	public Queue(){
		front = null;
		rear = null;
	}
	
	public void enQueue(int k){
		Node temp = new Node(k);
		
		if(rear==null){
			front = rear = temp;
			return;
		}
		
		rear.next = temp;
		rear = temp;
	}
	
	public int deQueue()throws Exception{
		if(front==null){
			throw new Exception("Queue is empty!!");
		}
		
		int key = front.key;
		front = front.next;
		
		if(front==null){
			rear = null;
		}
		return key;
	}
}


class QueueUsingLinkedList
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try{
			Queue q = new Queue();
			q.enQueue(1);
			q.enQueue(2);
			q.enQueue(3);
			System.out.println(q.deQueue());
			System.out.println(q.deQueue());
			System.out.println(q.deQueue());
			System.out.println(q.deQueue());
		}catch(Exception ex){
			System.out.println(ex);
		}
	}
}