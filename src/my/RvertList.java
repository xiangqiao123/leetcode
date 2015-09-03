package my;

import common.ListNode;

public class RvertList {
	
	public ListNode RevertLinkList(ListNode head){
		if(head==null || head.next==null){
			return head;
		}
		ListNode p=head;
		ListNode q=p.next;
		p.next=null;
		while(q!=null){
			ListNode r=q.next;
			q.next=p;
			p=q;
			q=r;
		}
		return p;
	}

	public static void main(String[] args) {
		ListNode head=new ListNode(1);
		ListNode n2=new ListNode(2);
		ListNode n3=new ListNode(3);
		ListNode n4=new ListNode(4);
		ListNode n5=new ListNode(5);
		ListNode n6=new ListNode(6);
		head.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		
		ListNode temp=head;
		while(temp!=null){
			System.out.println(temp.val);
			temp=temp.next;
		}
		
		head=new RvertList().RevertLinkList(head);
		temp=head;
		while(temp!=null){
			System.out.println(temp.val);
			temp=temp.next;
		}
	}

}
