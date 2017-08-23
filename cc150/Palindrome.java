package com.src.cc150;

import java.util.Stack;

/**
 *请编写一个函数，检查链表是否为回文。
 *给定一个链表ListNode* pHead，请返回一个bool，代表链表是否为回文。 
 *public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
 */
public class Palindrome {
	public boolean isPalindrome(ListNode pHead) {
        Stack stack=new Stack();
        int i=0;
        ListNode node=pHead;
        while(node!=null){
        	stack.push(node.val);
        	i++;
        }
        //i为链表的长度
        int n=i/2;
        System.out.println("i="+i+";n="+n);
        Stack stack2=new Stack<>();
        while(i>n){
        	stack2.push(stack.pop());
        	i--;
        }
        if(n==(i+1)){
        	stack2.pop();
        }
        while(i>0){
        	if(!stack.pop().equals(stack2.pop())){
        		return false;
        	}
        }
		return true;
    }
	public static void main(String[] args) {
		ListNode list1=new ListNode(1);
		ListNode list2=new ListNode(2);
		ListNode list3=new ListNode(3);
		ListNode list4=new ListNode(2);
		ListNode list5=new ListNode(1);
		list1.next=list2;
		list2.next=list3;
		list3.next=list4;
		list4.next=list5;
		System.out.println(new Palindrome().isPalindrome(list1));
	}
}
