package com.src.cc150;

import java.util.Stack;

public class Solution {
	 Stack<Integer> stack1 = new Stack<Integer>();
	    Stack<Integer> stack2 = new Stack<Integer>();
	    
	    public void push(int node) {
	    	while(!stack2.isEmpty()){
	    		stack1.add(stack2.pop());
	    	}
	        stack1.push(node);
	    }
	    
	    public int pop() {
	    	while(!stack1.isEmpty()){
	    		stack2.add(stack1.pop());
	    	}
	    	return stack2.pop();
	    }
	    public static void main(String[] args) {
			Solution su=new Solution();
			su.push(7);
			su.push(6);
			su.push(5);
			su.push(4);
			su.push(3);
			int i=1;
			while(su!=null){
			System.out.println(su.pop()+i++);
			}
		}
}
