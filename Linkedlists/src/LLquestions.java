import LLoperations.node;

public class LLquestions {



	public static void main(String args[]) {
		LLquestions obj = new LLquestions();
		
		
		node node1 = new node(1);
		node node2 =new node(2);
		node node3=new node(3);
		node node4=new node(4);
		node node5=new node(5);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		node5.next=node2;
		node temp=new node(1);
		node temp2=temp;
		for(int i=4;i<7;i++) {
			node curr=new node(i);
			temp.next=curr;
			temp=curr;
		}
		obj.head=node1;
		
		node3.next=null;
		node2.next.next=node4;		
		//node ans=intersection(head,temp2);
		//traversell(ans);
		
		  /*
	        obj.push(20); 
	        obj.push(4); 
	        obj.push(15); 
	        obj.push(10); 
	  */
	        /*Create loop for testing */
	        
		//count(node1,1);
		//traversell(node1);
		//System.out.println(detectLoop(head));
		//System.out.println(detectandcountLoop(head));
		node newnode=deleteloop(head);
		System.out.println(Length(newnode));
		
	}
	public static node intersection(node head1,node head2) {
		node temp1=head1;
		node temp2=head2;
		node newnode=null;
		
		while(temp1!=null&&temp2!=null) {
			if(temp1.data==temp2.data) {
				int k=temp1.data;
				node temp=new node(k);
				newnode.next=temp;
				//temp.next=newnode;
				newnode=temp;
				temp1=temp1.next;
				temp2=temp2.next;
			}else if(temp1.data<temp2.data) {
				temp1=temp1.next;
			}else {
				temp2=temp2.next;
			}
		}
		node ans=newnode.next;
		return ans;
	}
	public static int Length(node head) {
		int len=0;
		node temp=head;
		while(temp!=null){
			len++;
			temp=temp.next;
		}
		return len;
		
	}
	public static void lasttofirst() {
		node temp=head,temp1=head;
		for(int i=1;i<Length(head);i++) {
			temp1=temp1.next;
		}
		int k=temp.data;
		temp.data=temp1.data;
		temp1.data=k;
		
	}

	public static String detectLoop(node head) 
	{
		node slow_p = head, fast_p = head; 
		/*while (slow_p != null && fast_p != null && fast_p.next != null) { 
			slow_p = slow_p.next; 
			fast_p = fast_p.next.next; 
			if (slow_p == fast_p) { 
				 return "found";
			} 
			
		}*/
		while(fast_p!=null) {
			fast_p=fast_p.next;
			if(fast_p!=null) {
				if(slow_p==fast_p) {
					return "found";
				}else {
					fast_p=fast_p.next;
				}
				
			}//fast has travelled 2 steps so far
			if(fast_p==slow_p) {
				return "found";
			}
			slow_p=slow_p.next;
		}
		
		return "not found";
	} 
	public static int detectandcountLoop(node head) 
	{ 	
		node slow_p = head, fast_p = head; 
		while (slow_p != null && fast_p != null && fast_p.next != null) { 
			slow_p = slow_p.next; 
			fast_p = fast_p.next.next; 
			if (slow_p == fast_p) { 
				node temp=slow_p;
				int ct=1;
				while(temp.next!=slow_p) {
					temp=temp.next;
					ct++;
				}
				return ct;
			}
		}
		return 0;
			
	} 
	public static node deleteloop(node head) {
		node slow=head,fast=head;
		while(slow!=null&&fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				node temp=slow;
				int ct=1;
				while(temp.next!=slow) {
					temp=temp.next;
					ct++;
				}
			}
		}
		node temp1=head;
		while(true) {
			node temp2=slow;
			int flag=0;
			while(temp2.next!=slow) {
				if(temp2.next==temp1) {
					flag=1;
					break;
				}
				temp2=temp2.next;
			}
			if(flag==1) {
				temp2.next=null;
				break;
			}
			temp1=temp1.next;
		}
		return head;
	}
	public static void swap() {
		node temp=head;
		while(temp!=null&&temp.next!=null) {
			int k=temp.data;
			temp.data=temp.next.data;
			temp.next.data=k;
			temp=temp.next.next;
		}
	}
		 
	public static void count(node head,int k) {
		node temp=head;
		int ct=0;
		if(head== null) {
			return;
		}
		while(temp!=null){
			if(temp.data==k) {
				ct++;
			}
			temp=temp.next;
		}

		System.out.println(ct);
		
	}
	public static void traversell(node head) {
		if(head== null) return;

		node temp=head;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	static node head;
	public static class node{
		int data;
		node next;

		public node(int Listdata) {
			data=Listdata;
			next=null;
		}
	}
	

}
