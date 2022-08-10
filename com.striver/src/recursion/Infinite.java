package recursion;//program 1 in striver backtracking series.

public class Infinite {
	
	static void print() {
		System.out.println("Infinity");// will print infinite infinitely and hit StackOverflow
		print();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();

	}

}
