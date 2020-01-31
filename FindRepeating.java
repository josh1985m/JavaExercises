import java.util.*;
import java.util.LinkedList;
import java.util.Iterator;
public class FindRepeating 
{

	public static void main(String[] args) 
	{
		Random r = new Random();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		for (int i = 0; i < 50; i++)
		{
			ll.add(r.nextInt(51));
		}
		Iterator<Integer> it = ll.iterator();
		Collections.sort(ll);
		for (int j = 1; j < 51; j++)
		{
			int x = it.next();
			System.out.println(j + "," + x);
			if (j == x)
			{
				System.out.println("Match found! : " + x);
			}
		}
	}

}
