import java.util.*;
public class Lottery {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Please enter a number 1-9: ");
		int userNum1 = input.nextInt();
		System.out.println("Please enter a number 1-9: ");
		int userNum2 = input.nextInt();
		System.out.println("Please enter a number 1-9: ");
		int userNum3 = input.nextInt();
		input.close();
		int randNum1 = rand.nextInt(8) + 1;
		int randNum2 = rand.nextInt(8) + 1;
		int randNum3 = rand.nextInt(8) + 1;
		System.out.println("The lucky numbers are: " + randNum1 + randNum2 + randNum3);
		if (userNum1 == randNum1 && userNum2 == randNum2 && userNum3 == randNum3)
		{
			System.out.println("Congratulations you won $10,000!");
		}
		if (userNum1 == randNum1 || userNum1 == randNum2 || userNum1 == randNum3 && userNum2 != randNum1 && userNum2 != randNum2 && userNum2 != randNum3
				 && userNum3 != randNum1 && userNum3 != randNum2 && userNum3 != randNum3 ) 
		{
			System.out.println("Congratulations you won $1,000!");
		}
		if (userNum2 == randNum1 || userNum2 == randNum2 || userNum2 == randNum3 && userNum1 != randNum1 && userNum1 != randNum2 && userNum1 != randNum3
				 && userNum3 != randNum1 && userNum3 != randNum2 && userNum3 != randNum3 ) 
		{
			System.out.println("Congratulations you won $1,000!");
		}
		if (userNum3 == randNum1 || userNum3 == randNum2 || userNum3 == randNum3 && userNum2 != randNum1 && userNum2 != randNum2 && userNum2 != randNum3
				 && userNum1 != randNum1 && userNum1 != randNum2 && userNum1 != randNum3 ) 
		{
			System.out.println("Congratulations you won $1,000!");
		}
		
		if (userNum2 == randNum1 || userNum2 == randNum2 || userNum2 == randNum3) 
		{
			if (userNum3 == randNum1 || userNum3 == randNum2 || userNum3 == randNum3)
			{
				System.out.println("Congratulations you won3 $3,000!");
			}
		}
		if (userNum2 == randNum1 || userNum2 == randNum2 || userNum2 == randNum3) 
		{
			if (userNum1 == randNum1 || userNum1 == randNum2 || userNum1 == randNum3)
			{
				System.out.println("Congratulations you won3 $3,000!");
			}
		}
		if (userNum1 == randNum1 || userNum1 == randNum2 || userNum1 == randNum3) 
		{
			if (userNum3 == randNum1 || userNum3 == randNum2 || userNum3 == randNum3)
			{
				System.out.println("Congratulations you won3 $3,000!");
			}
		}	
	}
}
