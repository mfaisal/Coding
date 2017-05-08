/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Node{
	int item;
	Node left;
	Node right;
	
	Node(int it){
		item = it;
		left = null;
		right = null;
	}
}

class BinaryTree{
	int max;
	BinaryTree(){
		max = 0;
	}
	void inOrder(Node root){
		if(root!=null){
			inOrder(root.left);
			System.out.print(root.item + " ");
			inOrder(root.right);
		}
	}
	
	void longestConsecutiveUtil(Node root, int expected, int curLength, int res){
		if(root==null)
			return;
		if(root.item==expected){
			curLength++;
		}else{
			curLength = 1;
		}
		
		res = res>curLength? res:curLength;
		max = res>max? res : max;
		
		//System.out.println();
		//System.out.println(res);
		
		longestConsecutiveUtil(root.left,root.item+1,curLength, res);
		longestConsecutiveUtil(root.right,root.item+1,curLength, res);
	}
	
	int longestConsecutive(Node root){
		if(root==null)
			return 0;
		longestConsecutiveUtil(root, root.item, 0, 0);
		return max;
	}
}

class LongestConsecutiveInBinaryTree
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Node nd = new Node(6);
		nd.right = new Node(9);
		nd.left = new Node(7);
		nd.right.right = new Node(10);
		nd.right.right.right = new Node(11);
		
		BinaryTree bt = new BinaryTree();
		bt.inOrder(nd);
		
		int res = bt.longestConsecutive(nd);
		System.out.println();
		System.out.println(res);
	}
}