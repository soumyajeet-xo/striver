package recursion; //video 3
import java.util.*; //q3 Factorial of a number using function return

public class CFactF {
	static int fact(int n) {
		if(n==0)
			return 1;
		return n*fact(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fact=fact(n);
		System.out.println("Factorial is "+fact);
		sc.close();

	}

}
