class Node
{
	int value;
	Node nextNode;
	public Node(int value)
	{
		this.value = value;
	}
}

public class CircularLinkedList {
	private Node head = null;
	private Node tail = null;
	public void addNode(int value)
	{
		Node newNode = new Node(value);
		if (head == null)
		{
			head = newNode;
		}
		else
		{
			tail.nextNode = newNode;
		}
		tail = newNode;
		tail.nextNode = head;
	}
	public void printList()
	{
		Node currentNode = head;
		if (head != null)
		{
			do 
			{
				System.out.println(currentNode.value);
				currentNode = currentNode.nextNode;
			}
			while (currentNode != head);
		}
	}
	public void nextNode() 
	{
		Node currentNode = head;
		currentNode = currentNode.nextNode;
	}
	public boolean containsNode(int contains)
	{
		Node currentNode = head;
		if (head == null)
		{
			return false;
		}
		else
		{
			do
			{
				if (currentNode.value == contains)
				{
					return true;
				}
				currentNode = currentNode.nextNode;
			}
			while (currentNode != head);
			return false;
		}
	}
	public void removeNode(int removeNode)
	{
		Node currentNode = head;
	    if (head != null) 
	    {
	        if (currentNode.value == removeNode) 
	        {
	            head = head.nextNode;
	            tail.nextNode = head;
	        } 
	        else 
	        {
	            do 
	            {
	                Node nextNode = currentNode.nextNode;
	                if (nextNode.value == removeNode) 
	                {
	                    currentNode.nextNode = nextNode.nextNode;
	                    break;
	                }
	                currentNode = currentNode.nextNode;
	            } while (currentNode != head);
	        }
	    }
	}

	public static void main(String[] args) {
		CircularLinkedList newList = new CircularLinkedList();
		newList.addNode(0);
		newList.addNode(1);
		newList.addNode(2);
		newList.addNode(3);
		newList.addNode(4);
		newList.addNode(5);
		newList.addNode(6);
		newList.addNode(7);
		newList.addNode(8);
		newList.addNode(9);
		newList.printList();
		newList.containsNode(9);
		newList.nextNode();
		newList.removeNode(0);
		newList.printList();
	}

}
