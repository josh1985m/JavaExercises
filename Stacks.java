import java.util.*;
public class Stacks {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++)
		{
			arr.add(i);
		}
		for (int j = 9; j > -1; j--)
		{
			arr.add(j);
		}
		for (Integer k : arr)
		{
			if (stack.contains(k))
			{
				System.out.println("Identify repeated element from array: " + k);
			}
			else
			{
				while(stack.contains(k) == false)
				stack.push(k);
				System.out.println("Stack push k: " + k);
			}
		}
		System.out.println("Array contains: " + arr);
		System.out.println("Stack contains: " + stack);
		System.out.println("Remove stack elements and matching array elements.");
		for (int m = 0; m < stack.capacity(); m++)
		{
			Integer pop = stack.pop();
			System.out.println("Pop stack and make variable (pop) equal to element: "
					+ pop);
			arr.remove(pop);
			System.out.println("Remove element equal to pop from array: " + arr);
		}
		System.out.println("Final array: " + arr);
		System.out.println("Final stack: " + stack);
	}

}
