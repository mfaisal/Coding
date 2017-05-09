/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

//Find four elements a, b, c and d in an array such that a+b = c+d
class SameSumPairChecker
{
	static class Pair{
		int first;
		int second;
		
		Pair(int f, int s){
			first = f;
			second = s;
		}
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr = {3, 4, 7, 1, 2, 9, 8};//{3, 4, 7, 1, 2, 9, 8};//{3, 4, 7, 1, 12, 9};{65, 30, 7, 90, 1, 9, 8};
		checkSameSumOfTwoPairs(arr);
	}
	
	public static void checkSameSumOfTwoPairs(int[] arr){
		int n = arr.length;
		HashMap<Integer, Pair> firstTwo = new HashMap<Integer, Pair>(); 
		
		for(int i = 0; i < n-1; i++){
			for(int j = i + 1; j < n; j++){
				
				int sum = arr[i] + arr[j];
				if(!firstTwo.containsKey(sum)){
					Pair p = new Pair(arr[i],arr[j]);
					firstTwo.put(sum,p);
				}else{
					Pair p = firstTwo.get(sum);
					if((p.first!=arr[i]||p.first!=arr[j])&&(p.second!=arr[i]||p.second!=arr[j])){
						System.out.println("("+p.first+","+p.second+")("+arr[i]+","+arr[j]+")");
					}
				}
			}
		}
	}
}