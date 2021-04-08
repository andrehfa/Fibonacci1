package fibonacci;

public class SeqFibonacci {

	public static void main(String[] args) {
		int a = 1;
		int b = 0;
		int ab;

		for (int i = 0; i < 10; i++) {
			System.out.println(a);
			ab = a;
			a = a + b;
			b = ab;
		}

	}

}
