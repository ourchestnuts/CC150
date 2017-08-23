package com.src.cc150;
/**
 *有两个用链表表示的整数，每个结点包含一个数位。
 *这些数位是反向存放的，也就是个位排在链表的首部。
 *编写函数对这两个整数求和，并用链表形式返回结果。
 *给定两个链表ListNode* A，ListNode* B，请返回A+B的结果(ListNode*)。 
 */
public class Plus {
	 public ListNode plusAB(ListNode a, ListNode b) {
		 ListNode ab=new ListNode(-1);
		 ListNode node=ab;
		 while(a!=null&&b!=null){
			 node.next=new ListNode(a.val+b.val);
			 node=node.next;
		 }
		return ab.next;
	    }
}
