package recursion;

public class E1Fibo {
	
	static int fibo(int n) {
		if(n<=1)
			return n;
		return fibo(n-1)+fibo(n-2); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibo(4));
		

	}

}
