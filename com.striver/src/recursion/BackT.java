package recursion;
import java.util.*; // backtracking

public class BackT {
	
	static void print(int i,int n) {
		if(i<1)
			return;
		print(i-1,n);
			System.out.println(i);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		print(n,n);
		sc.close();

	}

}
