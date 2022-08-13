package recursion;
import java.util.*; //sum till n using function and not arguments

public class SumF {
	
	static int print(int n) {
		if(n==0)
			return 0;
		return n + print(n-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=print(n);
		System.out.println("Sum is "+sum);
		sc.close();

	}

}
