
public class linked_list {
	public static class Node{
		int data;
		Node next;
	}
	public static class MyLinkedList {
		static Node head;
		Node tail;
		int size;
		
	
	public Node createNode(int data) {
		Node temp=new Node();
		temp.data=data;
		temp.next=null;
		return temp;
	}
	public void addLast(int data)
	{   Node temp=createNode(data);
		if(size==0)
		{
			
			head=temp;
			tail=temp;
			
		}
		else
		{
			tail.next=temp;
			tail=temp;
		}
		size++;
	}
	public void addFirst(int data)
	{
		 Node temp=createNode(data);
		 temp.next=head;
		 head=temp;
		 size++;
	}
	public void addPosition(int data,int n)
	{
		Node temp=createNode(data);
		if(n==0)
		{
			head=temp;
			tail=temp;
		}
		
		Node temp2=head;
		for(int i=0;i<n-1;i++)
		{
			temp2=temp2.next;
			
		}
		temp.next=temp2.next;
		temp2.next=temp;
		
		
		size++;
	}
	public void removeFirst()
	{  if(size==0)
	    {
		System.out.println("Linked list is empty");
	    } 
	else if(size==1)
	{
		head=null;
		tail=null;
		size--;
	}
	   else
	  {
		head=head.next;
	     size--;
	   }
	}
	public void removeLast()
	{
		if(size==0)
		 {
			System.out.println("Linked list is empty");
		 } 
		else if(size==1)
		{
			head=null;
			tail=null;
			size--;
		}
		else
		{
			Node temp=head;
			for(int i=0;i<size-2;i++)
			{
				temp=temp.next;
			}
			tail=temp;
			temp.next=null;
		}
		size--;
	}
	public void removeNth(int n)
	{
		if(size==0)
		 {
			System.out.println("Linked list is empty");
		 } 
		if(n<0||n>(size-1)) 
		{
			System.out.println("Linked list is empty");
		}
		else if(size==1)
		{
			removeFirst();
		}
		else if(n==size-1)
		{
			removeLast();
		}
		
		else
		{
			Node temp=head;
			for(int i=0;i<n-2;i++)
			{
				temp=temp.next;
			}
			temp.next=temp.next.next;
			size--;
		}
		
	}
	public int getFirst() {
		return head.data;
	}
	
	public int getLast() {
		return tail.data;
	}
	public int getSize()
	{
		return size;
	}
	public int getpos(int n)
	{
		Node temp3=head;
		for(int i=0;i<n;i++) {
			temp3=temp3.next;
			
		}
		return temp3.data;
	}
	public int getMid()
	{
		Node s=head;
		Node f=head;
		while(f.next!=null &&f.next.next!=null) {
			s=s.next;
			f=f.next.next;
		}
		return s.data;
	}
	public  void display(Node head)
	{   Node temp=head;
	while(temp!=null)
	
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
		System.out.println();
	    
	
	}
	public  Node merge(Node l1,Node l2)
	{
		Node t1=l1;
		Node t2=l2;
		
		MyLinkedList result=new MyLinkedList();
		while(t1!=null && t2!=null)
		{
			if(t1.data<t2.data)
			{
				result.addLast(t1.data);
				t1=t1.next;
			}
			else
			{
				result.addLast(t2.data);
				t2=t2.next;
			}
		}
//		while(t1!=null)
//	{
//		result.addLast(t1.data);
//			t1=t1.next;
//		}
//	while(t2!=null)
//		{
//		result.addLast(t2.data);
//			t2=t2.next;
//		}
//		
		return result.head;
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {85,15,05,01,48};
		int[] arr2= {81,7,05,9,46};
    
     MyLinkedList list=new MyLinkedList();
     MyLinkedList list2=new MyLinkedList();
     MyLinkedList list3=new MyLinkedList();
    
     for(int i=0;i<5;i++)
     {
    	 list.addLast(arr1[i]);
    	 
     }
     
     
    	
    	 
     
     Node t3=list3.merge(list.head,list2.head);
     list.display(list.head);
     System.out.print(t3.data);
    
     
//     list.display();
//     list2.display();
     
     
//       list.addPosition(8,1);
//       list.addPosition(10,2);
//       System.out.println(list.getpos(2));
//       list.removeFirst();
//       list.removeLast();
//       list.removeNth(4);
//       list.display();
       
//       System.out.println(list.getMid());
     
//     list.display();
//     list2.display();
       }

	
}
