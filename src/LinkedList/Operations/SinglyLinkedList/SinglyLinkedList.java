package LinkedList.Operations.SinglyLinkedList;

public class SinglyLinkedList {

	static Node head = null;
	static Node tail = null;

	static class Node {

		Object data;
		Node next;

		Node(Object data) {
			this.data = data;
		}

	}

	public static void main(String[] args) {

		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		singlyLinkedList.insert(10);
		singlyLinkedList.insert(20);
		singlyLinkedList.insert(30);
		singlyLinkedList.insert(40);
		singlyLinkedList.insert(50);
		singlyLinkedList.insert(60);
		singlyLinkedList.insert(70);
		singlyLinkedList.insert(80);
		singlyLinkedList.insert(90);
		singlyLinkedList.insert(100);
		
		singlyLinkedList.display(); //10 20 30 40 50 60 70 80 90 100 
		
		
		singlyLinkedList.remove(50);
		
		singlyLinkedList.display();  //10 20 30 40 60 70 80 90 100 

	}
	
	public void remove(Object value) {
        Node current = head;
        Node previous = null;

        // Traverse the list to find the node to be removed
        while (current != null && current.data != value) {
            previous = current;
            current = current.next;
        }

        // If the node to be removed is found
        if (current != null) {
            // If the node is the head, update the head
            if (previous == null) {
                head = current.next;
            } else {
                // Otherwise, update the next reference of the previous node
                previous.next = current.next;
            }
        }
    }

/*
	//delete a node from the beginning of the singly linked list
	private void remove(Object i) {

		if(head!=null)
		{
			Node tempNode=head;
			Node previousNode=null;
			
			if(head.data.equals(i))
			{
				Node tempHead=head.next;
				head.next=null;
				head=tempHead;
				return;
			}
			
			while(tempNode.next!=null)
			{
				if(tempNode.data.equals(i))
				{
					Node nextAddress=tempNode.next;
					previousNode.next=nextAddress;
					tempNode.next=null;
					break;
				}
				else
				{
					previousNode=tempNode;
					tempNode=tempNode.next;
				}
			}
			
			if(tempNode.data.equals(i))
			{
				previousNode.next=null;
				tempNode=null;
			}
		}
		else
		{
			System.out.println("List is Empty");
		}
		
	}
*/
	private void insert(Object i) {

		Node node = new Node(i);
		if(head==null)
		{
			head=node;
			tail=node;
		}
		else
		{
			if(tail.next==null)
			{
				tail.next=node;
				tail=node;
			}
		}
	}
	
	public void display() {    
        //Node current will point to head    
        Node current = head;    
            
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Nodes of singly linked list: ");    
        while(current != null) {    
            //Prints each node by incrementing pointer    
            System.out.print(current.data + " ");    
            current = current.next;    
        }    
        System.out.println();    
    }    

}
