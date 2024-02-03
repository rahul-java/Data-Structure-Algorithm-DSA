package LinkedList.CustomLinkedList;

public class CustomLinkedList {
	
	static Node head=null;
	
	static class Node{
		
		Object data;
		Node next;
		
		Node(Object data){
			this.data=data;
		}
			
	}
	
	public static void main(String[] args) {
		
		CustomLinkedList customLinkedList = new CustomLinkedList();
		customLinkedList.insert(10);
		customLinkedList.insert(20);
		customLinkedList.insert(30);
		customLinkedList.insert(40);
		customLinkedList.insert(50);
		customLinkedList.insert(60);
		customLinkedList.insert(70);
		customLinkedList.insert(80);
		customLinkedList.insert(90);
		customLinkedList.insert(100);
		
		printList(customLinkedList);
		
	}

	private void insert(Object i) {

		Node node = new Node(i);
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node tempNode=head;
			while(tempNode.next!=null)
			{
				tempNode=tempNode.next;
			}
			tempNode.next=node;
		}
		
	}
	
	public static void printList(CustomLinkedList list) 
    { 
        Node currNode = list.head; 
    
        System.out.print("CustomLinkedList: "); 
    
        // Traverse through the LinkedList 
        while (currNode != null) { 
            // Print the data at current node 
            System.out.print(currNode.data + " "); 
    
            // Go to next node 
            currNode = currNode.next; 
        } 
    } 
	
}
