import java.util.*;
import java.lang.*;
import java.io.*;

//Union and Intersection of two Linked Lists

	class Node{
		int item;
		Node next;
		
		public Node(int it){
			item = it;
			next = null;
		}
	}
	
	class LinkedList{
		Node head;
		public LinkedList(){
			head = null;
		}
		
		public void add(int item){
			Node nd = new Node(item);
			nd.next = head;
			head = nd;
		}
		
		public LinkedList getUnion(Node nd1, Node nd2){
			//storing headers
			Node hd1 = nd1; // header of linkedlist 1
			Node hd2 = nd2; // header of linkedlist 2
			
			LinkedList ll = new LinkedList();
			HashSet<Integer> hs = new HashSet<Integer>(); // store items
			
			while(hd1!=null){
				if(!hs.contains(hd1.item)){
					hs.add(hd1.item);
					ll.add(hd1.item);
				}
				hd1 = hd1.next;
			}
			
			while(hd2!=null){
				if(!hs.contains(hd2.item)){
					hs.add(hd2.item);
					ll.add(hd2.item);
				}	
				hd2 = hd2.next;
			}
			return ll;
		}
	
	public LinkedList getIntersection(Node nd1, Node nd2){
		//storing headers
		Node hd1 = nd1; // header of linkedlist 1
		Node hd2 = nd2; // header of linkedlist 2
		LinkedList ll = new LinkedList();
		HashSet<Integer> hs = new HashSet<Integer>(); // store items
		//Node prev = null; // store end node of linkedlist 1
		
		while(hd1!=null){
		//	prev = hd1;
			if(!hs.contains(hd1.item)){
				hs.add(hd1.item);
			}
			hd1 = hd1.next;
		}
	
		while(hd2!=null){
			if(hs.contains(hd2.item)){
				//System.out.println(hd2.item);
				Node nd = new Node(hd2.item);
				nd.next = ll.head;
				ll.head = nd;
			}	
			hd2 = hd2.next;
		}
		
		return ll;
	}
	
	public void printList(){
		Node nd1 = head;
		while(nd1!=null){
			System.out.print(nd1.item + " ");
			nd1 = nd1.next;
		}
	}
}


class UnionIntersectionTwoLinkedList
{
	public static void main (String[] args) throws java.lang.Exception
		{
			LinkedList list1 = new LinkedList();
			list1.add(1);
			list1.add(2);
			list1.add(3);
			list1.add(4);
			list1.add(5);
			LinkedList list2 = new LinkedList();
			list2.add(4);
			list2.add(5);
			list2.add(6);
			list2.add(7);
			list2.add(8);
			
			
			
			LinkedList unions = list1.getUnion(list1.head, list2.head);
			LinkedList intersections = list1.getIntersection(list1.head, list2.head);
			
			unions.printList();
			System.out.println();
			intersections.printList();
			System.out.println();
			
			list1.printList();
			System.out.println();
			list2.printList();
			System.out.println();
		}
}