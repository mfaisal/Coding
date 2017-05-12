
import java.util.*;
import java.lang.*;
import java.io.*;


class Queue{
	int size;
	int capacity;
	int front;
	int rear;
	int[] arr;

	public Queue(int cap){
		size = 0;
		front = -1;
		capacity = cap;
		rear = cap - 1;
		arr = new int[cap];
	}	
	
	public boolean isEmpty(){
		return size==0;
	}
	
	public boolean isFull(){
		return size == capacity;
	}
	
	public void enque(int item) throws Exception{
		if(isFull()){
			throw new Exception("Queue is full!!");
		}
		front = (front+1)%capacity;
		size++;
		arr[front] = item;
	}
	
	public int deque() throws Exception{
		if(isEmpty()){
			throw new Exception("Queue is empty!!");
		}
		rear = (rear+1)%capacity;
		size--;
		return arr[rear];
	}
}

class TestQueue
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try{
			Queue  q = new Queue(5);
			q.enque(1);
			q.enque(2);
			q.enque(3);
			q.enque(4);
			q.enque(5);
			System.out.println(q.deque());
			
			q.enque(6);
			System.out.println(q.deque());
			q.deque();
			
			//q.deque();
			System.out.println(q.size);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}