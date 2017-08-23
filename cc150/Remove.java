package com.src.cc150;

public class Remove {
	/**
	 * 实现一个算法，删除单向链表中间的某个结点，假定你只能访问该结点。
给定带删除的节点，请执行删除操作，若该节点为尾节点，返回false，否则返回true
	 */
    public boolean removeNode(ListNode pNode) {
        // write code here
    	//ListNode node=pNode;
    	
        if(pNode.next==null){
            return false;
        }else{
           pNode=pNode.next;
            return true;
        }
    }
    /**
     * 编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
                         给定一个链表的头指针 ListNode* pHead，请返回重新排列后的链表的头指针。
                         注意：分割以后保持原来的数据顺序不变。
                         
                         
         特别注意声明时付给节点的初始化值  在操作过程中并没有将值覆盖掉，因此要进行处理 分别将两个链表的头去掉
     */
    public ListNode partition(ListNode pHead, int x) {
    
    	ListNode pnode=pHead;
    	ListNode newHead=new ListNode(-1);
    	ListNode bigHead=new ListNode(-1);
    	ListNode node=newHead;
    	ListNode bnode=bigHead;
    	if(pHead==null){
    		return null;
    	}
    	while(pnode!=null){
    		if(pnode.val<x){
    			//小于  则加在新链表中
    			node.next=new ListNode(pnode.val);
    			node=node.next;
    		}else{
    			bnode.next=new ListNode(pnode.val);
    			bnode=bnode.next;
    		}
    		pnode=pnode.next;
    	}//如果有下一个
    	pnode=newHead;
    	while(pnode.next!=null&&pnode.next.val!=-1){
    		pnode=pnode.next;
    	}
    	pnode.next=bigHead.next;
		return newHead.next;
    }
}
