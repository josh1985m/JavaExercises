
public class NestedLoops {

	public static void main(String[] args) {
		int k = 6;
        for(int i = 1; i <= k; ++i) 
        {
            for(int j = 1; j <= i; ++j) 
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        	
		int n = 7;
		int i1, j1; 
		for(i1=0; i1<n; i1++) 
		{ 
			for(j1=2*(n-i1); j1>=0; j1--) 
			{ 
				System.out.print(" "); 
			} 
			for(j1=1; j1<=i1; j1++) 
			{  
				System.out.print(" " + i1); 
			} 
			System.out.println(" "); 
		} 
		
		
		int w = 6;
		for (int j = 1; j <= 6; j++)
		{
			for(int i = 1; i <= w; i++)
			{
				System.out.print(i + " ");
			}
			System.out.println(" ");
			w--;
		}
		
		int m = 6;	
		for (int i = 1; i <= 6; i++)
		{
			for (int j = 1; j <= m; j++)
			{
				System.out.print(j + " ");
			}
			m--;
			System.out.println();
			for (int q = 1; q <= i; q++)
			{
				System.out.print(" ");
			}
		}
		
		
}}