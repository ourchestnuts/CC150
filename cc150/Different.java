package com.src.cc150;

import java.util.Stack;

import algorithm.Sort._9bucketSort;
public class Different {
	/**
	 *判断字符串内是否有重复字符 
	 */
	 public static boolean checkDifferent(String iniString) {
		/* int length=iniString.length();
	        for(int i=1;i<length;i++){
	            for(int j=i+1;j<length;j++){
	                if(iniString.charAt(i)==iniString.charAt(j)){
	                    return false;
	                }
	            }
	        }
	        return true;*/
		 return !iniString.matches(".*(.)(.*\\1).*");
		 //正则表达式  http://www.runoob.com/regexp/regexp-syntax.html
	    }
	  public static void main(String[] args) {
		new Different().sort();
	}
	  private void sort() {
		  ListNode node=new ListNode(1);
			ListNode node1=new ListNode(2);
			ListNode node2=new ListNode(3);
			node.next=node1;
			node1.next=node2;
			System.out.println(FindKthToTail(node,1).value);
	}/**以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
		给定一个链表的头指针 ListNode* pHead，请返回重新排列后的链表的头指针。
		注意：分割以后保持原来的数据顺序不变。
	*/
	  public ListNode partition(ListNode pHead, int x) {
		  if(pHead==null)
			  return null;
		 
		  ListNode head=new ListNode(x);//前半截链表的头
		  ListNode node=head;
		  
		  if(pHead.value<x){
			  node=new ListNode(pHead.value);
		  	  pHead=pHead.next;
		  }
		  ListNode no=pHead;
		  while(no.next!=null){
			  if(no.next.value<x){
				  //加在新的链表上
				  node=new ListNode(no.next.value);
				  node=node.next;
				  no.next=no.next.next;
			  }else{
				  no=no.next;
			  }
		  }
		  
		return pHead;
	    }
	/**
	   * 输出链表中倒数第K个节点
	   */
	  public static ListNode FindKthToTail(ListNode head,int k) {
		  Stack<ListNode> stack=new Stack<>();
		  ListNode node=head;
		  int j=0;
	     while(node!=null){
	    	 stack.push(node);
	    	 j++;
	    	 node=node.next;
	     }
	     if(k>=j){
	    	 return null;
	     }
	     for(int i=1;i<k;i++){
	    	 stack.pop();
	     }   
			return stack.pop();
	    }
	  class ListNode{
			int value;
			ListNode next;
			
			ListNode(int value){
				this.value=value;
			}
		}
	  /**
	   *字符串翻转 
	   *StringBuffer 有reverse方法
	   */
	public static String reverseString(String iniString) {
	     StringBuffer str=new StringBuffer(iniString);
	     return str.reverse().toString();//倒叙
	     
	        
	}
}
