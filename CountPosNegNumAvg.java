import java.util.*;
public class CountPosNegNumAvg {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<Integer>();
		System.out.println("Please enter a number (0 to quit): \n");
		while(scanner.hasNextInt()) 
		{
			int input = scanner.nextInt();
			numbers.add(input);
			if (input == 0)
			{
				System.out.println("You have entered zero to end.");
				break;
			}
			System.out.println("Please enter a number (if Zero '0' Program ends): ");
		}
		Integer total = 0;
		int pos = 0;
		int neg = 0;
		for (int i = 0; i < numbers.size(); i++)
		{
			total += numbers.get(i);
			if (numbers.get(i) < 0)
			{
				neg++;
			}
			else
			{
				pos++;
			}
		}
		System.out.println("The number of positive numbers is: " + pos + "\n");
		System.out.println("The number of negative numbers is: "+ neg + "\n");
		System.out.println("The total is: " + total + "\n");
		System.out.println("The average is: " + total/numbers.size() + "\n");
	}

}
