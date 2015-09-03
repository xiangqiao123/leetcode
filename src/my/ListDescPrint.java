package my;

import java.util.Stack;

import common.ListNode;

public class ListDescPrint {
	
	public void  listDescPrint(ListNode head){
		Stack<Integer> tmpStack = new Stack<Integer>();
		if (head == null){
			return;
		}
		ListNode p = head;
		while(p!=null){
			tmpStack.push(p.val);
			 p =p.next;
		}
		
		while(!tmpStack.isEmpty()){
			System.out.println(tmpStack.pop());
		}
	}

	public void listDescPrintByRe(ListNode p){
		if(p == null){
			return;
		}else{
			listDescPrintByRe(p.next);
			System.out.println(p.val);
		}
		
		
		
	}
	
	public static void main(String[] args) {
		ListNode head=new ListNode(1);
		ListNode n2=new ListNode(2);
		ListNode n3=new ListNode(3);
		ListNode n4=new ListNode(4);
		ListNode n5=new ListNode(5);
		ListNode n6=new ListNode(6);
		/*head.next=n2;*/
	/*	n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;*/
		new ListDescPrint().listDescPrintByRe(null);

	}

}
