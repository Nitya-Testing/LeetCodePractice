package recursion;

public class printOneToN {

	public static void print(int n) {
		if (n == 0) {
			return;
		}

		print(n - 1); //7,6,5,4,3,2,1
		System.out.println(n);
	}

	public static void main(String[] args) {
		
		print(8);

	}

}
