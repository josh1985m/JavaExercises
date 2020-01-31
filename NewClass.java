
public class NewClass {
	int x;
	int y;
	public NewClass(int y) {
		x = y;
		y = x;
	}

	public static void main(String[] args) {
		NewClass myObj = new NewClass(5);
		System.out.println(myObj.x);
		System.out.print(myObj.y);

	}

}
