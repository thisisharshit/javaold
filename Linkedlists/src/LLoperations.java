

public class LLoperations {

	static node head;
	
	public void push(int new_data) 
    { 
        /* 1 & 2: Allocate the Node & 
                  Put in the data*/
        node new_node = new node(new_data); 
        
        /* 3. Make next of new Node as head */
        new_node.next = head; 
  
        /* 4. Move the head to point to new Node */
        head = new_node; 
       
    } 
	public static class node{
		int data;
		node next;
		
		public node(int Listdata) {
			data= Listdata;
			next = null;
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
		//return ct;
	}
	public static void traversell(node head) {
		if(head== null) return;
		
		node temp=head;
		while(temp!=null){
			System.out.println(temp.data);
			//temp=temp.getNext();
			temp=temp.next;
		}
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
	public static node reverseLinkedList(node head) 
	{ 
		// For first node, previousNode will be null 
		node previousNode=null; 
		node nextNode; 
		node currentNode=head;
		while(currentNode!=null) 
		{ 
			nextNode=currentNode.next; 
			// reversing the link 
			currentNode.next=previousNode; 
			// moving currentNode and previousNode by 1 node 
			previousNode=currentNode; 
			currentNode=nextNode; 
		} 
		return previousNode; 
	} 
	public static boolean palindrome(node head) {
		boolean palindrome =true;
		
		if(head==null) {
			palindrome = false;
		}
		node temp=head;
		int m=Length(head)/2;
		for(int i=0;i<m;i++) { 
			temp=temp.next;
		}
		node temp2 = reverseLinkedList(temp);
		
		for(int i=0;i<m;i++) {
			if(head.data!=temp2.data) {
				palindrome=false;
			}
			head=head.next;
			temp2=temp2.next;
		}
		
		return palindrome;
	}
	public static node removeduplicates(node head) {
		if(head==null) {
			return head;
		}
		node curr=head;
		while(curr!=null) {
			node temp=curr.next;
			while(temp!=null&&temp.data==curr.data) {
				temp=temp.next;
				
			}
			curr.next=temp;
			curr=curr.next;
		}
		return head;
	}
	public static node removedupli(node head) {
		if(head==null) {
			return head;
		}
		node temp=head;
		
		return head;
	}
	public static int middle(node head) {
		node slowpointer, fastpointer;
		slowpointer=fastpointer=head;
		
			while(fastpointer!=null) {
				fastpointer=fastpointer.next;
				if(fastpointer!=null&&fastpointer.next!=null) {
					slowpointer=slowpointer.next;
					fastpointer=fastpointer.next;
				}
			}
			
		if(Length(head)%2==1) {
			return slowpointer.data;
		}else {
			return ((slowpointer.next).data);
		}
	}
	public static void main(String args[]) {
		Linkedlists obj = new Linkedlists();

		LLoperations object = new LLoperations();
		node node1 = new node(1);
		node node2 =new node(2);
		node node3=new node(3);
		node node4=new node(4);
		node node5=new node(4);
		node node6=new node(4);
		node node7=new node(5);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		node5.next=node6;
		node6.next=node7;
		object.head=node1;
		/*node temp=node1;
		for(int i=2;i<7;i++) {
			node curr=new node(i);
			temp.next=curr;
			temp=curr;
		}
		
		*/
				
		/*
		object.push(1);
		object.push(2);
		object.push(3);
		object.push(4);
		*/
		//count(head,);
		
		//System.out.println(middle(head));
		//node reversedhead = reverseLinkedList(head);
		//traversell(reversedhead);
		//node new1=removeduplicates(node1);
		
		//traversell(reversedhead);
		
		//System.out.println(palindrome(head));
		
		//traversell(head);
		node distinct=removeduplicates(head);
		traversell(distinct);
		
	}
	
}

