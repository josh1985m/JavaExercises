import java.util.*;
import java.util.LinkedList;
import java.util.Iterator;
public class Collection2 
{

	public static void main(String[] args) 
	{
		LinkedList<Integer> ll = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number (Enter 0 to end): ");
		while(sc.hasNext())
		{
			int num = sc.nextInt();
			if (num == 0)
			{
				sc.close();
				break;
			}
			else
			{
				ll.add(num);
				System.out.println("Please enter a number (Enter 0 to end): ");
			}
		}
		Iterator<Integer> it = ll.iterator();
		Iterator<Integer> lt = ll.iterator();
		Collections.sort(ll);
		int count = 0;
		for (int j = 0; j < ll.size(); j++)
		{
			int x = it.next();
			int y = lt.next();
			if (y == x)
			{
				count++;
				System.out.println("Match found! : " + y + "," + x + "\nThere were " + count + " instances of the number.");
			}
		}
	}

}
