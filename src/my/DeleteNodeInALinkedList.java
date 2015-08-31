package my;

import common.ListNode;

public class DeleteNodeInALinkedList {

	 public void deleteNode(ListNode node) {
	        ListNode n=node.next;
	        node.val=n.val;
	        node.next=n.next;
	 }
	 
	public static void main(String[] args) {
		ListNode head=new ListNode(1);
		
		ListNode n1=new ListNode(2);
		head.next=n1;
		ListNode n2=new ListNode(3);
		n1.next=n2;
		ListNode n3=new ListNode(4);
		n2.next=n3;
		new DeleteNodeInALinkedList().deleteNode(n2);
		
		ListNode temp=head;
		while(temp!=null){
			System.out.println(temp.val);
			temp=temp.next;
		}
		
		
		

	}

}
