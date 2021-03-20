
public class DLLoperations {

	public static void main(String args[]) {
		
		DLLnode node1=new DLLnode(1);
		DLLnode node2=new DLLnode(3);
		DLLnode node3=new DLLnode(5);
		DLLnode node4=new DLLnode(7);
		DLLnode node5=new DLLnode(9);
		//DLLnode obj=new DLLnode(3);
		//obj.head=node1;
		node1.next=(node2);
		node2.prev=(node1);
		node2.next=(node3);
		node3.prev=(node2);
		node3.next=(node4);
		node4.prev=(node3);
		node4.next=(node5);
		node5.prev=(node4);
		//traversell(node4);
		insertionatk(node1,10,3);
		traversell(node4);
	}
	public static void traversell(DLLnode node) {
		if(node==null) return;
		
		DLLnode temp=node;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.prev;
		}
		temp=node.next;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public static void insertionatk(DLLnode head, int data,int k) {
		if(head == null) return;
		DLLnode temp=head;
		for(int i=1;i<k-1;i++) {
			temp=temp.next;	
		}
		DLLnode newnode=new DLLnode(data);
		
		newnode.next=temp.next;
		newnode.prev=temp;
		temp.next=newnode;
		//return head;
	}
}
