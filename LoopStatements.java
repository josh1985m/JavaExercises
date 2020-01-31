
public class LoopStatements {

	public static void main(String[] args) 
	{
		int m = 1;
		for (int i = 1; i <= 7; i++)
		{
			for (int j = 1; j <= m; j++)
			{
				System.out.print(j + " ");
			}
			m++;
		    for (int k = 6; k >= 0; k--)// Need help understanding why this always prints 6 times??
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
