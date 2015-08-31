package my;

import common.ListNode;

public class AddTwoNumbers {
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		return addTwoNumbersHelper(l1,l2,0);
	}
	
	public ListNode addTwoNumbersHelper(ListNode l1, ListNode l2,int carry) {
		while(l1==null && l2 ==null && carry==0 ){
			return null;
		}
		int a=0;
    	int b=0;
    	if(l1!=null){
    		a=l1.val;
    	}
    	if(l2!=null){
    		b=l2.val;
    	}
    	ListNode current=new ListNode((a+b+carry)%10);
    	current.next=addTwoNumbersHelper(l1==null?null:l1.next,l2==null?null:l2.next,(a+b+carry)/10);
		return current;
	}
	
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
    	ListNode head=null;
    	int to_next=0;
    	ListNode pre = null;
    	
        while(l1!=null || l2 !=null || to_next!=0 ){
        	int a=0;
        	int b=0;
        	if(l1!=null){
        		a=l1.val;
        		l1=l1.next;
        	}
        	if(l2!=null){
        		b=l2.val;
        		l2=l2.next;
        	}
        	ListNode current=new ListNode((a+b+to_next)%10);
        	if(head==null){
        		head=current;
        	}else{
        		pre.next=current;
        	}
        	pre=current;
        	to_next=(a+b+to_next)/10;
        }
      
        
        return head;
    }

	public static void main(String[] args) {
		ListNode n1=new ListNode(2);
		ListNode h1=n1;
		ListNode n2=new ListNode(4);
		n1.next=n2;
		ListNode n3=new ListNode(3);
		n2.next=n3;
		
		ListNode n4=new ListNode(5);
		ListNode h2=n4;
		ListNode n5=new ListNode(6);
		n4.next=n5;
		ListNode n6=new ListNode(4);
		n5.next=n6;
		ListNode h=new AddTwoNumbers().addTwoNumbers(h1, h2);
		while(h!=null){
			System.out.println(h.val);
			h=h.next;
		}
		
		
	}

}
